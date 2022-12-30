package task;

public enum Direction {
    North(0, -1), West(-1, 0), South(0, 1), East(1, 0);

    private int X;
    private int Y;
    Direction(int X, int Y){
        this.X = X;
        this.Y = Y;
    }
    public Vector2 move(Vector2 begining, double interval){
        return new Vector2(begining.getX() + (interval * X), begining.getY() + (interval * Y));
    }
}
