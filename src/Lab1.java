public class Lab1 {
    public static void main(String[] arg) {
        Point3d p1 = new Point3d(Double.parseDouble(arg[0]), Double.parseDouble(arg[1]), Double.parseDouble(arg[2]));
        Point3d p2 = new Point3d(Double.parseDouble(arg[3]), Double.parseDouble(arg[4]), Double.parseDouble(arg[5]));
        Point3d p3 = new Point3d(Double.parseDouble(arg[6]), Double.parseDouble(arg[7]), Double.parseDouble(arg[8]));

        if (p1.simile(p2) || p2.simile(p3) || p3.simile(p1)) {
            System.out.println("Points coordinates are invalid");
        }
        else {
            System.out.println(computeArea(p1, p2, p3));
            }
        }

        /** Площадь треугольника **/
    static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double part1 = p1.distanceTO(p2);
        double part2 = p2.distanceTO(p3);
        double part3 = p3.distanceTO(p1);
        double perim  = part1 + part2 + part3;

        return Math.sqrt(perim/2 * (perim/2 - part1) * (perim/2 - part2) * (perim/2 - part3));
    }
}
