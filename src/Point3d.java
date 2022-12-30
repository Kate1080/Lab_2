public class Point3d extends Point2d {
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    /** Конструктор по умолчанию **/
    public Point3d() {
        this(0, 0, 0);
    }

    /** Устанавливает значение Z **/
    public void SetZ(double val) {
        zCoord = val;
    }

    /** Координаты Z **/
    public double GetZ() {
        return zCoord;
    }

    /** Сравнивает соответствующие координаты 2 точек **/
    public boolean simile(Point3d that) {
        return getX() == that.getX() || getY() == that.getY() || GetZ() == that.GetZ();
    }

    /** Ищет расстояние между точками **/
    public double distanceTO(Point3d that) {
        double len = Math.sqrt(Math.pow(getX() - that.getX(), 2) + Math.pow(getY() - that.getY(), 2) +
                Math.pow(GetZ() - that.GetZ(), 2));
        return len;
    }

}
