package Foundation;

import Maps.Floor;

public class Mapping {

    // Left side make a forest leading to the dungeon
    public static final Floor OUTSIDE_CASTLE= new Floor("OUTSIDE_CASTLE", new String[] {
            "UUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvxUUUUUUUUUUUUUUUUUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvx6",
            "UUUUUUUoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrswUUUUUUUUUUUUUUUUUUUUUUoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsw6",
            "UUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvxUUUUUUUUUUUUUUUUUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvx6",
            "UUUUUUUoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrswUUUUUUUUUUUUUUUUUUUUUUoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsw6",
            "UUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvxUUUUUUUUUUUUUUUUUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvx6",
            "UUUUUUUoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrswUUUUUUUUUUUUUUUUUUUUUUoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsw6",
            "UUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvxUUUUUUUUUUUUUUUUUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvx6",
            "UUUUUUnnnzoqrsqrsqrsqrsqrsqrsqrsqrsqrswUUUUUUUUUUUUUUUUUUUUUUoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsw6",
            "UUUUUUnnnzptuvtuvtuvtuvtuvtuvtuvtuvtuvxUUUUUUUUUUUUUUUUUUUUUUptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvx6",
            "UUUUUUnoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrswnUUUUUUUUTSRUUUUUUUUUUnnnnnnnnnnnnnnnnnnnnnnnnnnoqrswUUUUUUU6",
            "UUUUUnnptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvxnUUUUUUUQPONMLUUUUUUUUnnnnnnnnnnnnnnnnnnnnnnnnnnptuvxUUUUUUU6",
            "UUUUnnnoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrswnnnUUUUUKJIHGFUUUUUUnnnnoqrsqrsqrsqrsqrsqrsqrswnnnnnnUUUUUUU6",
            "UUUUnnnptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvxnnnnnUUUUEDCBAUUUUnnnnnnptuvtuvtuvtuvtuvtuvtuvxnnnnnnnUUUUUU6",
            "UUUUnnnnnnoqrsqrsqrsqrsqrsqrsqrsqrsqrswnnnnnnnnnnijnnnnnnnnnoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrswnnUUUUU6",
            "UUUnnnnnnnptuvtuvtuvtuvtuvtuvtuvtuvtuvxnnnnnnnnnnegnnnnnnnnnptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvxnowUUUU6",
            "UUUnownnnnnnnnnnnnnoqrsqrsqrsqrsqrsqrswoqrswnnnnnegnnnnoqrswoqrswoqrsqrsqrsqrsqrsqrsqrsqrswznpxzUUU6",
            "UUnnpxnnnnnnnnnnnnnptuvtuvtuvtuvtuvtuvxptuvxnnnnnegnnnnptuvxptuvxptuvtuvtuvtuvtuvtuvtuvtuvxznnnnUUU6",
            "Unnnnnnnnnnnnnnownnnnoqrsqrsqrsqrsqrswoqrswoqrswnegnoqrswoqrswoqrqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsw6",
            "Unnnnnnn12nnnnnpxnnnnptuvtuvtuvtuvtuvxptuvxptuvxnegnptuvxptuvxptutuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvx6",
            "Unnnnnnn34nnnnnnnnnnnnoqrsqrsqrsqrsqrsqrsqrsqrswnegnoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsw6",
            "Unnnnnnnnnnnnnownnnnnnptuvtuvtuvtuvtuvtuvtuvtuvxnegnptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvx6",
            "Unnnnnnnnnnnnnpxnnnnnnoqrsqrsqrsqrsqrsqrsqrsqrswnegnoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsw6",
            "UUnnnnnnownnnnnnnnnnnnptuvtuvtuvtuvtuvtuvtuvtuvxnegnptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvx6",
            "UUUUnnnnpxnnnnnnnnnnnnoqrsqrsqrsqrsqrsqrsqrsqrswnegnoqrsqrsqrsqrsqrsqrsqrsqrsqrsqrsqrswnnnnnnnnnnnn6",
            "UUUUUUUUnnnnnnnnnnownnptuvtuvtuvtuvtuvtuvtuvtuvxnegnptuvtuvtuvtuvtuvtuvtuvtuvtuvtuvtuvxnnnnnnnnnnnn6",
            "UUUUUUUUUUUnnnnnnnpxnnoqrsqrsqrsqrsqrsqrsqrsqrswnegnoqrsqrsqrsqrsqrsqrswnnnnnnnnnnnnnnnnnownnnnnnnn6",
            "UUUUUUUUUUUUUUnnnnnnnnptuvtuvtuvtuvtuvtuvtuvtuvxnegnptuvtuvtuvtuvtuvtuvxnnnnnnnnownnnnnnnpxnnnnnnnn6",
            "UUUUUUUUUUUUUUUUnnnnnnoqrsqrsqrsqrsqrsqrsqrsqrswnegnoqrsqrsqrsqrswnnnnnnnnnnnnnnpxnnnnnnnnnnnnnnnnn6",
            "UUUUUUUUUUUUUUUUUUnnnnptuvtuvtuvtuvtuvtuvtuvtuvxnegnptuvtuvtuvtuvxnnnnnnownnnnnnnnnnnnnnnnnnnnnnnnn6",
            "UUUUUUUUUUUUUUUUUUUUnnnoqrsqrsqrsqrsqrsqrswnnnnnnegnnnnnnnnnnnnnnnnnnnnnpxnnnnnnnnnnnnnnnnnnnnnnnn56",
            "UUUUUUUUUUUUUUUUUUUUUnnptuvtuvtuvtuvtuvtuvxibbbbbdkbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbZ",
            "UUUUUUUUUUUUUUUUUUUUUUnnnnnnnbbjnnnnnnibbbbdmccccccccccccccccccccccccccccccccccccccccccccccccccccccZ",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUncclkbbbbbbdmccccfoqrswoqrswnnnnnnnnnnnnnownnnnnnnnnownnnnnnnnnnnnnnnnn56",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhccccccccfoqrswptuvxptuvxnnnnnnnnnnnnnpxnnnnnnnnnpxnnnnnnnnnnnnnnnnnn6",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnoqrsqrswptuvxUUUUUUUUUUnnnnnownnnnnnnnnnnnnnnnnnnnnnnnnnnnnnownnnnn6",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUptuvtuvxUUUUUUUUUUUUUUUUUUUUpxnnnnnnnnnnnnownnnnnnnnnnnnnnnnpxnnnnn6",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnpxnnnnnnnnnnnnnnnnnnnnnnn6",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUownnnnnnnnnnnnn6",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUpxnnnnnnnnnnnnn6",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnnnnnnnnnnnnn6",
            "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnn6",
            "````````````````````````````````````````````````````````````````````````````````````````````````````",


    }, 98, 30, 0,0);

    public static final Floor INSIDE_CASTLE= new Floor("INSIDE_CASTLE", new String[] {
            "LCCCCCCCCCCCCCCCCCCCCCCM",
            "6OBBBBBBBBBBBBBBBBBBBBNI",
            "6IRRRRRRRRRRRRRRRRRRRR6I",
            "6IRRRRRRRRRRRRRRRRRRRR6I",
            "6Innnnabcdefgnnnnnnnnn6I",
            "6Innnnhijklmonnnnnnnnn6I",
            "6Innnnpqrstuvnnnn234nn6I",
            "6InnnnwxyzFGKnnnn578nn6I",
            "6In%&nPQTUVWXn%&n9`~nn6I",
            "6In^*nnYZ$nnnn^*n!@#nn6I",
            "1ASSSSSSSSSSSSSSSSSSSS6I",
            "1ASSSSSSSSSSSSSSSSSSSS6I",
            "6In%&nn%&nn%&nn%&nn%&n6I",
            "6In^*nn^*nn^*nn^*nn^*n6I",
            "6Innnnnnnnnnnnnnnnnnnn6I",
            "6HCCCCCCCCCCCCCCCCCCCCDI",
            "JBBBBBBBBBBBBBBBBBBBBBBE",
            "RRRRRRRRRRRRRRRRRRRRRRRR",
            "RRRRRRRRRRRRRRRRRRRRRRRR",
    }, 2, 10, 10, 9,18,10);

    public static final Floor GUILD= new Floor("GUILD", new String[] {
            "bccccccccccccccccccd",
            "iaaaaaaaaaaaaaaaaaae",
            "iaaaaaaaaaaaaaaaanae",
            "ipaaaaaaaaaaaaaaaaae",
            "iaaaaaaaaaaaaaaaaaae",
            "iaaaaaaaaaaaaaaaaaae",
            "hggkaaaaajlggggggggf",
            "~~~iaaaaae~~~~~~~~~~",
            "~~~iaaaaae~~~~~~~~~~",
            "~~~hgggggf~~~~~~~~~~",
    }, 10, 5);

    public static final Floor BLACKSMITH= new Floor("BLACKSMITH", new String[] {
            "bcccccccccccccd",
            "iaaaaaaaaaaaaae",
            "iaaaaaaoaaaaaae",
            "iaaaaaaaaaaaaae",
            "iaaaaaaaaaaaaae",
            "iaaaaaaaaaaaaae",
            "iaaaaaaaaaaaaae",
            "iaaaaaaaaaaaaae",
            "iaaaaaaaaaaaaae",
            "hggggggmggggggf",
    }, 7, 8);

    public static final Floor BOSS_ROOM = new Floor("BOSS_ROOM", new String[] {
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
            "nnnnnnnnnnnnnnnnnn",
    }, 0, 4, true);
}
