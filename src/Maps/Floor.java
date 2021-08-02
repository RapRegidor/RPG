package Maps;

public class Floor {
    private Tile[][] tiles;
    private int entPosX1;
    private int entPosY1;
    private int entPosX2;
    private int entPosY2;
    private int entPosX3;
    private int entPosY3;
    private boolean dungeon;

    //Make a separate constructor for inside castle
    private String name;
    public Floor(String name, String[] map, int posX1, int posY1, int posX2, int posY2) {
        this.name = name;
        entPosX1 = posX1;
        entPosY1 = posY1;
        entPosX2 = posX2;
        entPosY2 = posY2;


        tiles = new Tile[map.length][];

        for (int row = 0; row < map.length; row++) {
            tiles[row] = new Tile[map[row].length()];

            for (int col = 0; col < map[row].length(); col++) {
                switch (map[row].charAt(col)) {
                    case '0':
                        tiles[row][col] = new Tile("receptionist", col, row);
                        break;
                    case '`':
                        tiles[row][col] = new Tile("blank", col, row);
                        break;
                    case 'A':
                        tiles[row][col] = new Tile("1", col, row);
                        break;
                    case 'B':
                        tiles[row][col] = new Tile("2", col, row);
                        break;
                    case 'C':
                        tiles[row][col] = new Tile("3", col, row);
                        break;
                    case 'D':
                        tiles[row][col] = new Tile("4", col, row);
                        break;
                    case 'E':
                        tiles[row][col] = new Tile("5", col, row);
                        break;
                    case 'F':
                        tiles[row][col] = new Tile("7", col, row);
                        break;
                    case 'G':
                        tiles[row][col] = new Tile("8", col, row);
                        break;
                    case 'H':
                        tiles[row][col] = new Tile("9", col, row);
                        break;
                    case 'I':
                        tiles[row][col] = new Tile("10", col, row);
                        break;
                    case 'J':
                        tiles[row][col] = new Tile("11", col, row);
                        break;
                    case 'K':
                        tiles[row][col] = new Tile("12", col, row);
                        break;
                    case 'L':
                        tiles[row][col] = new Tile("13", col, row);
                        break;
                    case 'M':
                        tiles[row][col] = new Tile("14", col, row);
                        break;
                    case 'N':
                        tiles[row][col] = new Tile("15", col, row);
                        break;
                    case 'O':
                        tiles[row][col] = new Tile("16", col, row);
                        break;
                    case 'P':
                        tiles[row][col] = new Tile("17", col, row);
                        break;
                    case 'Q':
                        tiles[row][col] = new Tile("18", col, row);
                        break;
                    case 'R':
                        tiles[row][col] = new Tile("21", col, row);
                        break;
                    case 'S':
                        tiles[row][col] = new Tile("22", col, row);
                        break;
                    case 'T':
                        tiles[row][col] = new Tile("23", col, row);
                        break;
                    case 'U':
                        tiles[row][col] = new Tile("water", col, row);
                        break;
                    case 'Z':
                        tiles[row][col] = new Tile("castle_gate", col, row);
                        break;
                    case '6':
                        tiles[row][col] = new Tile("castle_top6", col, row);
                        break;
                    case 'b':
                        tiles[row][col] = new Tile("ground_1", col, row);
                        break;
                    case 'c':
                        tiles[row][col] = new Tile("ground_2", col, row);
                        break;
                    case 'd':
                        tiles[row][col] = new Tile("ground_3", col, row);
                        break;
                    case 'e':
                        tiles[row][col] = new Tile("ground_4", col, row);
                        break;
                    case 'f':
                        tiles[row][col] = new Tile("ground_5", col, row);
                        break;
                    case 'g':
                        tiles[row][col] = new Tile("ground_6", col, row);
                        break;
                    case 'h':
                        tiles[row][col] = new Tile("ground_7", col, row);
                        break;
                    case 'i':
                        tiles[row][col] = new Tile("ground_8", col, row);
                        break;
                    case 'j':
                        tiles[row][col] = new Tile("ground_9", col, row);
                        break;
                    case 'k':
                        tiles[row][col] = new Tile("ground_10", col, row);
                        break;
                    case 'l':
                        tiles[row][col] = new Tile("ground_11", col, row);
                        break;
                    case 'm':
                        tiles[row][col] = new Tile("ground_12", col, row);
                        break;
                    case 'n':
                        tiles[row][col] = new Tile("grass_patch", col, row);
                        break;
                    case 'o':
                        tiles[row][col] = new Tile("tree_left1", col, row);
                        break;
                    case 'p':
                        tiles[row][col] = new Tile("tree_left2", col, row);
                        break;
                    case 'q':
                        tiles[row][col] = new Tile("tree_center1", col, row);
                        break;
                    case 'r':
                        tiles[row][col] = new Tile("tree_center2", col, row);
                        break;
                    case 's':
                        tiles[row][col] = new Tile("tree_center3", col, row);
                        break;
                    case 't':
                        tiles[row][col] = new Tile("tree_center4", col, row);
                        break;
                    case 'u':
                        tiles[row][col] = new Tile("tree_center5", col, row);
                        break;
                    case 'v':
                        tiles[row][col] = new Tile("tree_center6", col, row);
                        break;
                    case 'w':
                        tiles[row][col] = new Tile("tree_right1", col, row);
                        break;
                    case 'x':
                        tiles[row][col] = new Tile("tree_right2", col, row);
                        break;
                    case '1':
                        tiles[row][col] = new Tile("portal1", col, row);
                        break;
                    case '2':
                        tiles[row][col] = new Tile("portal2", col, row);
                        break;
                    case '3':
                        tiles[row][col] = new Tile("portal3", col, row);
                        break;
                    case '4':
                        tiles[row][col] = new Tile("portal4", col, row);
                        break;
                    case '5':
                        tiles[row][col] = new Tile("guard", col, row);
                        break;
                    case 'z':
                        tiles[row][col] = new Tile("money", col, row);
                        break;
                }
            }
        }
    }

    public Floor(String name, String[] map, int posX1, int posY1, int posX2, int posY2, int posX3, int posY3) {
        this.name = name;
        entPosX1 = posX1;
        entPosY1 = posY1;
        entPosX2 = posX2;
        entPosY2 = posY2;
        entPosX3 = posX3;
        entPosY3 = posY3;

        tiles = new Tile[map.length][];

        for (int row = 0; row < map.length; row++) {
            tiles[row] = new Tile[map[row].length()];

            for (int col = 0; col < map[row].length(); col++) {
                switch (map[row].charAt(col)) {
                    case '1':
                        tiles[row][col] = new Tile("castle_gate", col, row);
                        break;
                    case 'A':
                        tiles[row][col] = new Tile("castle_gate1", col, row);
                        break;
                    case 'B':
                        tiles[row][col] = new Tile("castle_top1", col, row);
                        break;
                    case 'C':
                        tiles[row][col] = new Tile("castle_top2", col, row);
                        break;
                    case 'D':
                        tiles[row][col] = new Tile("castle_top3", col, row);
                        break;
                    case 'E':
                        tiles[row][col] = new Tile("castle_top4", col, row);
                        break;
                    case '6':
                        tiles[row][col] = new Tile("castle_top6", col, row);
                        break;
                    case 'H':
                        tiles[row][col] = new Tile("castle_top7", col, row);
                        break;
                    case 'I':
                        tiles[row][col] = new Tile("castle_top8", col, row);
                        break;
                    case 'J':
                        tiles[row][col] = new Tile("castle_top9", col, row);
                        break;
                    case 'L':
                        tiles[row][col] = new Tile("castle_top11", col, row);
                        break;
                    case 'M':
                        tiles[row][col] = new Tile("castle_top12", col, row);
                        break;
                    case 'N':
                        tiles[row][col] = new Tile("castle_top13", col, row);
                        break;
                    case 'O':
                        tiles[row][col] = new Tile("castle_top14", col, row);
                        break;
                    case 'R':
                        tiles[row][col] = new Tile("castle_wall", col, row);
                        break;
                    case 'S':
                        tiles[row][col] = new Tile("stone_road", col, row);
                        break;
                    case 'n':
                        tiles[row][col] = new Tile("grass_patch", col, row);
                        break;
                    case '0':
                        tiles[row][col] = new Tile("blacksmith", col, row);
                        break;

                    case '2':
                        tiles[row][col] = new Tile("blacksmith_top1", col, row);
                        break;
                    case '3':
                        tiles[row][col] = new Tile("blacksmith_top2", col, row);
                        break;
                    case '4':
                        tiles[row][col] = new Tile("blacksmith_top3", col, row);
                        break;
                    case '5':
                        tiles[row][col] = new Tile("blacksmith_c1", col, row);
                        break;
                    case '7':
                        tiles[row][col] = new Tile("blacksmith_c2", col, row);
                        break;
                    case '8':
                        tiles[row][col] = new Tile("blacksmith_c3", col, row);
                        break;
                    case '9':
                        tiles[row][col] = new Tile("blacksmith_d1", col, row);
                        break;
                    case '`':
                        tiles[row][col] = new Tile("blacksmith_d2", col, row);
                        break;
                    case '~':
                        tiles[row][col] = new Tile("blacksmith_d3", col, row);
                        break;
                    case '!':
                        tiles[row][col] = new Tile("blacksmith_bot1", col, row);
                        break;
                    case '@':
                        tiles[row][col] = new Tile("blacksmith_door", col, row);
                        break;
                    case '#':
                        tiles[row][col] = new Tile("blacksmith_bot3", col, row);
                        break;

                        //GUILD

                    case 'a':
                        tiles[row][col] = new Tile("row-1-col-1", col, row);
                        break;
                    case 'b':
                        tiles[row][col] = new Tile("row-1-col-2", col, row);
                        break;
                    case 'c':
                        tiles[row][col] = new Tile("row-1-col-3", col, row);
                        break;
                    case 'd':
                        tiles[row][col] = new Tile("row-1-col-4", col, row);
                        break;
                    case 'e':
                        tiles[row][col] = new Tile("row-1-col-5", col, row);
                        break;
                    case 'f':
                        tiles[row][col] = new Tile("row-1-col-6", col, row);
                        break;
                    case 'g':
                        tiles[row][col] = new Tile("row-1-col-7", col, row);
                        break;
                    case 'h':
                        tiles[row][col] = new Tile("row-2-col-1", col, row);
                        break;
                    case 'i':
                        tiles[row][col] = new Tile("row-2-col-2", col, row);
                        break;
                    case 'j':
                        tiles[row][col] = new Tile("row-2-col-3", col, row);
                        break;
                    case 'k':
                        tiles[row][col] = new Tile("row-2-col-4", col, row);
                        break;
                    case 'l':
                        tiles[row][col] = new Tile("row-2-col-5", col, row);
                        break;
                    case 'm':
                        tiles[row][col] = new Tile("row-2-col-6", col, row);
                        break;
                    case 'o':
                        tiles[row][col] = new Tile("row-2-col-7", col, row);
                        break;
                    case 'p':
                        tiles[row][col] = new Tile("row-3-col-1", col, row);
                        break;
                    case 'q':
                        tiles[row][col] = new Tile("row-3-col-2", col, row);
                        break;
                    case 'r':
                        tiles[row][col] = new Tile("row-3-col-3", col, row);
                        break;
                    case 's':
                        tiles[row][col] = new Tile("row-3-col-4", col, row);
                        break;
                    case 't':
                        tiles[row][col] = new Tile("row-3-col-5", col, row);
                        break;
                    case 'u':
                        tiles[row][col] = new Tile("row-3-col-6", col, row);
                        break;
                    case 'v':
                        tiles[row][col] = new Tile("row-3-col-7", col, row);
                        break;
                    case 'w':
                        tiles[row][col] = new Tile("row-4-col-1", col, row);
                        break;
                    case 'x':
                        tiles[row][col] = new Tile("row-4-col-2", col, row);
                        break;
                    case 'y':
                        tiles[row][col] = new Tile("row-4-col-3", col, row);
                        break;
                    case 'z':
                        tiles[row][col] = new Tile("row-4-col-4", col, row);
                        break;
                    case 'F':
                        tiles[row][col] = new Tile("row-4-col-5", col, row);
                        break;
                    case 'G':
                        tiles[row][col] = new Tile("row-4-col-6", col, row);
                        break;
                    case 'K':
                        tiles[row][col] = new Tile("row-4-col-7", col, row);
                        break;
                    case 'P':
                        tiles[row][col] = new Tile("row-5-col-1", col, row);
                        break;
                    case 'Q':
                        tiles[row][col] = new Tile("row-5-col-2", col, row);
                        break;
                    case 'T':
                        tiles[row][col] = new Tile("row-5-col-3", col, row);
                        break;
                    case 'U':
                        tiles[row][col] = new Tile("row-5-col-4", col, row);
                        break;
                    case 'V':
                        tiles[row][col] = new Tile("row-5-col-5", col, row);
                        break;
                    case 'W':
                        tiles[row][col] = new Tile("row-5-col-6", col, row);
                        break;
                    case 'X':
                        tiles[row][col] = new Tile("row-5-col-7", col, row);
                        break;
                    case 'Y':
                        tiles[row][col] = new Tile("row-6-col-2", col, row);
                        break;
                    case 'Z':
                        tiles[row][col] = new Tile("row-6-col-3", col, row);
                        break;
                    case '$':
                        tiles[row][col] = new Tile("row-6-col-4", col, row);
                        break;
                    case '%':
                        tiles[row][col] = new Tile("tree_left1", col, row);
                        break;
                    case '^':
                        tiles[row][col] = new Tile("tree_left2", col, row);
                        break;
                    case '&':
                        tiles[row][col] = new Tile("tree_right1", col, row);
                        break;
                    case '*':
                        tiles[row][col] = new Tile("tree_right2", col, row);
                }
            }
        }
    }

    public Floor(String name, String[] map, int posX1, int posY1) {
        this.name = name;
        entPosX1 = posX1;
        entPosY1 = posY1;

        tiles = new Tile[map.length][];

        for (int row = 0; row < map.length; row++) {
            tiles[row] = new Tile[map[row].length()];

            for (int col = 0; col < map[row].length(); col++) {
                switch (map[row].charAt(col)) {
                    case '~':
                        tiles[row][col] = new Tile("blank", col, row);
                        break;
                    case 'a':
                        tiles[row][col] = new Tile("wooden_floor", col, row);
                        break;
                    case 'b':
                        tiles[row][col] = new Tile("topLeft", col, row);
                        break;
                    case 'c':
                        tiles[row][col] = new Tile("top", col, row);
                        break;
                    case 'd':
                        tiles[row][col] = new Tile("topRight", col, row);
                        break;
                    case 'e':
                        tiles[row][col] = new Tile("right", col, row);
                        break;
                    case 'f':
                        tiles[row][col] = new Tile("botRight", col, row);
                        break;
                    case 'g':
                        tiles[row][col] = new Tile("bot", col, row);
                        break;
                    case 'h':
                        tiles[row][col] = new Tile("botLeft", col, row);
                        break;
                    case 'i':
                        tiles[row][col] = new Tile("left", col, row);
                        break;
                    case 'j':
                        tiles[row][col] = new Tile("cornerRight", col, row);
                        break;
                    case 'k':
                        tiles[row][col] = new Tile("cornerLeft", col, row);
                        break;
                    case 'l':
                        tiles[row][col] = new Tile("guild_exit", col, row);
                        break;
                    case 'm':
                        tiles[row][col] = new Tile("blacksmith_exit", col, row);
                        break;
                    case 'n':
                        tiles[row][col] = new Tile("wizard", col, row);
                        break;
                    case 'o':
                        tiles[row][col] = new Tile("blacksmith", col, row);
                        break;
                    case 'p':
                        tiles[row][col] = new Tile("receptionist", col, row);
                        break;
                }
            }
        }
    }

    public Floor(String name, String[] map, int posX1, int posY1, boolean dungeon) {
        this.name = name;
        entPosX1 = posX1;
        entPosY1 = posY1;
        this.dungeon = dungeon;

        tiles = new Tile[map.length][];

        for (int row = 0; row < map.length; row++) {
            tiles[row] = new Tile[map[row].length()];

            for (int col = 0; col < map[row].length(); col++) {
                switch (map[row].charAt(col)) {
                    case 'n':
                        tiles[row][col] = new Tile("grass_patch", col, row);
                        break;

                }
            }
        }
    }

    public int getSizeX() {
        return tiles[0].length;
    }

    public int getSizeY() {
        return tiles.length;
    }

    public Tile getTileAt(int x, int y) {
        return tiles[y][x];
    }

    public void setTile(int x, int y){
        if(tiles[y][x].getName().equals("money")) {
            tiles[y][x] = new Tile("grass_patch", x, y);
        }
    }

    public int getEntPosX1() {
        return entPosX1;
    }

    public int getEntPosY1() {
        return entPosY1;
    }

    public int getEntPosX2() {
        return entPosX2;
    }

    public int getEntPosY2() {
        return entPosY2;
    }

    public int getEntPosX3() {
        return entPosX3;
    }

    public int getEntPosY3() {
        return entPosY3;
    }

    public String getName(){
        return name;
    }
}


