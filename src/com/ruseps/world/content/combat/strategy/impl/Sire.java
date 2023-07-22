package com.ruseps.world.content.combat.strategy.impl;

import com.ruseps.engine.task.Task;
import com.ruseps.engine.task.TaskManager;
import com.ruseps.model.Animation;
import com.ruseps.model.Graphic;
import com.ruseps.model.Locations;
import com.ruseps.model.Position;
import com.ruseps.model.Projectile;
import com.ruseps.model.Skill;
import com.ruseps.util.Misc;
import com.ruseps.world.content.combat.CombatContainer;
import com.ruseps.world.content.combat.CombatType;
import com.ruseps.world.content.combat.strategy.CombatStrategy;
import com.ruseps.world.entity.impl.Character;
import com.ruseps.world.entity.impl.npc.NPC;
import com.ruseps.world.entity.impl.player.Player;

public class Sire implements CombatStrategy {

	@Override
	public boolean canAttack(Character entity, Character victim) {
		return true;
	}

	@Override
	public CombatContainer attack(Character entity, Character victim) {
		return null;
	}

	@Override
	public boolean customContainerAttack(Character entity, Character victim) {
		NPC sire = (NPC)entity;
		if(sire.isChargingAttack() || victim.getConstitution() <= 0) {
			return true;
		}
			if(Misc.getRandom(10) <= 2) {
				Player p = (Player)victim;
				int lvl = p.getSkillManager().getCurrentLevel(Skill.CONSTITUTION);
				lvl *= 0.9;
				p.getSkillManager().setCurrentLevel(Skill.CONSTITUTION, p.getSkillManager().getCurrentLevel(Skill.CONSTITUTION) - lvl <= 0 ?  1 : lvl);
				p.getPacketSender().sendMessage("The sire has gained some health, Draining your hitpoints!");
				victim.performGraphic(new Graphic(1176));
		}
		if(Locations.goodDistance(sire.getPosition().copy(), victim.getPosition().copy(), 3) && Misc.getRandom(5) <= 3) {
			sire.getCombatBuilder().setContainer(new CombatContainer(sire, victim, 1, 1, CombatType.MAGIC, true));
			if(Misc.getRandom(10) <= 2) {
				victim.performGraphic(new Graphic(1847));
				new Projectile(sire, victim, 2183, 44, 3, 43, 40, 0).sendProjectile();
			}
		} else {
			sire.setChargingAttack(true);
			sire.getCombatBuilder().setContainer(new CombatContainer(sire, victim, 1, 3, CombatType.MAGIC, true));
			TaskManager.submit(new Task(1, sire, false) {
				int tick = 0;
				@Override
				public void execute() {
					if(tick == 0) {
						new Projectile(sire, victim, 146, 44, 3, 41, 40, 0).sendProjectile();
					} else if(tick == 1) {
						sire.setChargingAttack(false);
						stop();
					}
					tick++;
				}
			});
		}
		return true;
	}

	@Override
	public int attackDelay(Character entity) {
		return entity.getAttackSpeed();
	}

	@Override
	public int attackDistance(Character entity) {
		return 3;
	}

	@Override
	public CombatType getCombatType() {
		return CombatType.MIXED;
	}
}
