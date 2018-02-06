import java.util.Scanner;

class Polygon{
    public static void main(String[]args){
	
	
    }
    public boolean doLinesIntersect(LineSegment a, LineSegment b) {
	Point[] box1 = a.getBoundingBox();
	Point[] box2 = b.getBoundingBox();
	return doBoundingBoxesIntersect(box1, box2)
            && lineSegmentTouchesOrCrossesLine(a, b)
            && lineSegmentTouchesOrCrossesLine(b, a);
    }
    public boolean lineSegmentTouchesOrCrossesLine(LineSegment a,
						   LineSegment b) {
	return isPointOnLine(a, b.first)
            || isPointOnLine(a, b.second)
            || (isPointRightOfLine(a, b.first) ^ 
                isPointRightOfLine(a, b.second));
    }
    public boolean doBoundingBoxesIntersect(Point[] a, Point[] b) {
    return a[0].x <= b[1].x 
        && a[1].x >= b[0].x 
        && a[0].y <= b[1].y
        && a[1].y >= b[0].y;
    }
    public boolean isPointOnLine(LineSegment a, Point b) {
	// Move the image, so that a.first is on (0|0)
	LineSegment aTmp = new LineSegment(new Point(0, 0), new Point(
								      a.second.x - a.first.x, a.second.y - a.first.y));
	Point bTmp = new Point(b.x - a.first.x, b.y - a.first.y);
	double r = crossProduct(aTmp.second, bTmp);
	return Math.abs(r) < EPSILON;
    }
    public boolean isPointRightOfLine(LineSegment a, Point b) {
	// Move the image, so that a.first is on (0|0)
	LineSegment aTmp = new LineSegment(new Point(0, 0), new Point(
								      a.second.x - a.first.x, a.second.y - a.first.y));
	Point bTmp = new Point(b.x - a.first.x, b.y - a.first.y);
	return crossProduct(aTmp.second, bTmp) < 0;
    }

}