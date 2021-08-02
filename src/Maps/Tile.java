package Maps;

public class Tile {
    private String name;
    private int xPos;
    private int yPos;

    //creates a tile
    //name = type of the tile: water, wall, road, grass, door
    //x and y are the positions of it in the floor
    //tile is 35 x 35
    public Tile(String name, int posX, int posY) {
        this.name = name;
        xPos = posX;
        yPos = posY;
    }

    public String getName() {
        return name;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

}
