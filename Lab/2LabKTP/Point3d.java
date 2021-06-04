public class Point3d  extends Point2d {
    private double zCoord;
    public Point2d(int x, int y, int z){
        
    }
    }
    public Point3d(){
        this(0,0,0);
    }
    /*Получение значений координат*/
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }
    /* Задание значений координат */
    public void setX(double val){
        xCoord = val;
    }
    public void setY(double val){
        yCoord = val;
    }
    public void setZ(double val){
        zCoord = val;
    }
    public double distanceTo(Point3d anotherPoint){
        return Math.sqrt(Math.pow(xCoord - anotherPoint.getX(),2)
        +Math.pow(yCoord - anotherPoint.getY(),2)
        +Math.pow(zCoord - anotherPoint.getZ(),2));

    }

}
