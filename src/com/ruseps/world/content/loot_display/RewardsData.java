package com.ruseps.world.content.loot_display;

import java.util.HashMap;
import java.util.Map;

public enum RewardsData {
	
	DONATIONB(1, new int[] {997, 19908, 15332, 18992, 18994, 18998, 19000, 19980, 18944, 18444, 18912, 20100, 20102, 20104, 11896, 10502, 11147, 11148, 11149, 7081, 11659, 937, 8518} , "Donation Box"),
	
	AURORABOX(2, new int[] {20120, 20122, 20124, 7080, 19920, 20126, 20128, 20130, 20132, 20134, 20136, 18852, 18854, 18856, 18858, 18860, 18864, 20106, 20108, 20110, 20112,
			20114, 20116, 20150, 20154, 20156, 20158, 20160, 20162, 18990, 18992, 18994, 18998, 19000, 19980, 6657, 6659, 6661, 6663, 18920, 18936, 
			18950, 18448, 18446, 18942, 18910, 20521, 13045, 18350, 14460, 14462, 14464, 18896, 18898, 18900, 8788, 18444, 18912, 18944, 13047, 8421, 5079, 5080, 5081, 19918, 
			11005, 10480, 19921, 11000, 10503, 11654,10682, 10683, 10684, 10685, 20522, 11653, 11659 } , "Aurora's Mbox #1"),
	
	AURORABOX2(3, new int[] {11147, 11148, 11149, 11650, 7081, 11039, 11040, 11041, 11042, 11004, 15485, 
			20134, 940, 10991, 20128, 10992, 10993, 10994, 10995, 10480, 10822, 10824, 10826, 11206, 11208, 
			7082, 20100, 20102, 20104, 11896, 20658, 20659, 20660, 20140, 20142, 20144, 20146, 10502, 11661, 
			11662, 11679, 11680, 11681, 11682, 20656, 11658, 5090, 5091, 5092, 20650, 20651, 20652, 20653, 20654, 
			938, 937, 11651, 5085, 5086, 5087, 5088, 5089 } , "Aurora's Mbox #2"),
	
	GOODIEBAG(4, new int[] { 20120, 19913, 20124, 20122, 20132, 20130, 17291, 941, 944, 20106, 20108, 20110, 20116, 20114, 20112, 19918, 19919, 18854, 18860, 18864, 18858, 18868,
			18852, 18856, 18900, 18898, 14462, 18896, 14460, 20146, 20134, 20128, 998, 997, 5081, 5079, 5080, 10480, 11662, 11679, 11661, 5082, 5083, 5084, 10482, 19908, 19909, 19910,
			20657, 11005, 18440, 18914, 18946, 19972, 19976, 19978, 19974, 19970, 19962, 19964, 19958, 19956, 19960, 19868, 20100, 20104, 20102, 18944, 18912, 18444, 965, 19992, 11896,
			964, 10504, 11071, 11068, 11067, 11078, 11087, 11142, 11144, 11142, 11146, 11145, 20519,20520, 1005, 20522, 1031, 1033, 1035, 996, 1000, 8666, 938, 19990, 10943 } , "Goodie Bag"),
	
	LEGENDARYB(5, new int[] {941, 944, 18852, 18854, 18856, 18858, 18860, 18864, 18868, 20106, 20110, 20112, 20114, 20116, //Uncommon, 0
			20134, 20136, 20138, 20140, 20142, 10502, 14018, 20150, 20154, 20156, 20158, 20160, //Rare, 1
			18900, 18896, 18898, 14460, 14462, 10822, 11208, 10824, 11206, 10826, //Epic, 2
			11005, 11000, 20657 } , "Legenday MBox"),
	
	AURORASPECIAL(6, new int[] { 8656, 8657, 8658, 8659, 8863, 8864, 8865,11661, 11662, 11679, 11680, 11681, 11682, 20656, 11658, //Common, 0
			938, 937, 19098, 19099, 19100, 798, 799, 894, 895, 896, 5090, 5091, 5092, 20650, 20651, 20652,
			19067, 19068, 19069, 19070, 19071, 19072, 20653, 20654, 938, 937, 11651, 5085, 5086, 5087, 5088, 5089, 8518,
			19048, 19049, 19050, 19051, 19052, 19053, 19054, 19055, 940, 10991, 10992, 10993, 10994, 10995, 10480, 10822, 
			19056, 19057, 19058, 19059, 19060, 19061, 19062,
			19082, 19080, 19084, 21023, 21024, 21025, 21026, 21027, 21028,
			21056, 19085, 21004, 21005, 21006,  10824, 10826, 11206, 11208} , "Aurora Special MBox"),	
	
	OWNERBOX(7, new int[] { 11067, 11068, 11071, 11078, 11087, 1007, 1002, 1005, 965, 1000,//Common, 0
			902, 903, 904, 905, 906, 15246, 897, 898, 899, 900, 901, 21027, 21018, 21019, 21020, 21021, 21022,
			18440, 18914, 18946, 20527, 20528, 20529, 15246, 21034, 21000, 21001, 21002, 21003,
			2544, 2546, 2547, 2548, 2549,21048, 21049, 21050, 21051, 21052, 21053, 21054,
			18968, 18969, 18970, 18971, 18972, 18973, 21040, 21041, 21042, 21043, 21044, 21045, 21046, 2104,
			405, 18982, 18983, 18993, 19021, 2545, 18974, 18975, 18976,
			6832, 7960, 21056, 6831, 2542, 6830, 18977, 18978, 18979, 19014, 19015, 1413, 19671 }  , "Owner MBox"),
	
	SAYIAN_RAIDS(8, new int[] {19992,2572, 19960,19962,19956,19958,19964,19990, // 1:333 chance
			19970,19972,19974,19978,19976,19868 },"Sayain Raids"),
	
	POKE_RAIDS(9, new int[] {19098, 19100, 19099, 19093, 19096, 1002, 938, 19097,
			20650, 20651, 20652, 20653, 20654, 20658, 20659, 20660, 8871, 8860, 8861, 8862, 999, 15501, 
			18986, 11659, 7080, 5585},"Poke Raids"),
	
	ANIME_RAIDS(10, new int[] { 21000, 21001, 21002, 21003, 21034, 1002, 21016, 21017, 21018, 21019, 21020, 21021, 21022,
			21029, 21030, 21031, 21032, 21033, 21026, 21004, 21005, 21006,
			21023, 21024, 21025, 21027, 21028, 21007, 21008, 21009, 21010, 21011, 21012,
			19098, 19100, 19099, 19093, 19096, 938, 19097, 915},"Anime Raids"),
	
	MORTAL_RAIDS(11, new int[] {21048, 21049, 21050, 21051, 21052, 21053, 21054, 2749, 2751, 2753, 2756, 2754, 2755, 18057,
			2773, 2775, 2777, 2779, 2781, 2784, 2787,
			2768, 2769, 2770, 2771, 2772, 2789,
			11896, 21057, 21058, 21059, 21060, 21061, 21062, 21063, 21064},"Mortal Raids"),
		
	SILVER_RAIDS(12, new int[] { 19106, 19107, 19116, 19117, 19118, 19119, 19120, 19121, 19122,
     1031, 1033, 1035, 11896, 21057, 21058, 21059, 21060, 21061, 21062, 21063, 21064,
     19110, 19112, 19113, 19114, 19115, 19103, 19104, 19105, 19108, 19109, },"Silver Raids"), 
	
	GOLD_RAIDS(13, new int[] { 2749, 2751, 2753, 2756, 2754, 2755,
			2765, 2766, 2767, 2773, 2775, 2777, 2779, 2781, 2784, 2787,
			2759, 2760, 2761, 2762, 2764, 2768, 2769, 2770, 2771, 2772, 2789 },"Gold Raids"), 
	
	PLAT_RAIDS(14, new int[] { 2848, 2849, 2850, 2851, 2852, 2853, 2854, 2855, 
			3490, 3491, 3492, 3494, 3493, 18948, 2679, 18966,
			18943, 18947, 18949, 18941, 18951, 18952, 18953, 18955, 18956, 18939 },"Plat Raids"),

	DIAMOND_RAIDS(15, new int[] {3495, 3496, 3505, 3506, 3507, 3508,
			3509,3499, 3500, 3501, 3502, 3503, 3504, 3498, 3497}, "Diamond Raids"),

	AOECHEST(16, new int[]  { 19920, 20134, 20150, 20154, 20156, 20158, 20160, 20162,
			20106, 20108, 20110, 20112, 20114, 20116,
			7080, 20132, 20128, 18852, 18854, 18856, 18858, 18860, 18864, 18868,
			20120, 20122, 20124, 941, 94 },"Aoe Chest"),
	
	DONOR1(17, new int[] {20106, 20108, 20110, 20112, 20114, 20116, 19919, 19920,
			14018, 20150, 20154, 20156, 20158, 19918,
			2572, 11005, 14460, 14462, 18896, 18898, 18900},"10$ Key"),
	
	DONOR2(18, new int[] {2572, 11005, 14460, 14462, 18896, 18898, 18900,
			10503, 11654, 20522, 11659, 11653, 20146, 11650,
			10682, 10683, 10684, 10685, 940, 11039, 11040, 11041, 11042, 10480, 19888},"$20 Key"),
	
	DONOR3(19, new int[] {20100, 20102, 11896, 20104, 10822, 10824, 10826, 11206, 11208, 7082,
			11896, 10502, 20126, 20136, 20138, 20140, 20142, 20144, 20656,
			11661, 11662, 11679, 11680, 11681, 11682, 11658, 20520, 20658, 20659, 20660},"$30 Key"),
	
	DONOR4(20, new int[] {20650, 20651, 20652, 20653, 20654, 937, 20658, 20659, 20660,996, 965, 5085,
			5086, 5087, 5088, 5089, 18876, 11651, 5082, 5083, 5084,
			799, 894, 895, 896, 798, 938, 8860, 8861, 8862, 8871, 8656, 8657, 8658, 8659, 8660, },"$40 Key"),
	
	DONOR5(21, new int[] { 799, 894, 895, 896, 798, 938, 8860, 8861, 8862, 8871, 8656, 8657, 8658, 8659, 8660,
			11068, 11071, 11078, 11087, 11067, 2542, 18440, 18914, 18946, 20527, 20528, 20529,
			6830, 6832, 7960, 11949, 405, 18982, 18983, 18993, 19021, 2545, 2544, 2546, 2547, 2548, 2549} ,"$50 Key"),
	
	NULL(22, new int[] { },"");

	private int index;
	private String RewardName;
	private int item[];
	private int amount;
	
	public int getIndex() {
		return index;
	}

	public int[] getItemID() {
		return item;
	}

	public String getText() {
		return RewardName;
	}


	public int getAmount() {
		return amount;
	}


	RewardsData(int index, int[] item, String RewardName) {
		this.index = (index);
		this.item = (item);
		this.RewardName = (RewardName);
	}
	
	static final Map<Integer, RewardsData> byId = new HashMap<Integer, RewardsData>();
	
	static {
		for (RewardsData e : RewardsData.values()) {
			if (byId.put(e.getIndex(), e) != null) {
				  throw new IllegalArgumentException("duplicate id: " + e.getIndex());
			}
		}
	}
	
	public static RewardsData getById(int id) {
		if(byId.get(id) == null) {
			return byId.get(0);
		}
	    return byId.get(id);
	}
}