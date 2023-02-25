package task;

public enum Direction {
    North(0, -1), West(-1, 0), South(0, 1), East(1, 0);

    private int x;
    private int y;
    Direction(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Vector2 move(Vector2 begining, double interval){
        return new Vector2(begining.getX() + (interval * x), begining.getY() + (interval * y));
    }
}
