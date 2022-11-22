https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package spatialindex.spatialindex;

public interface IShape
{
	public boolean intersects(final IShape s);
	public boolean contains(final IShape s);
	public boolean touches(final IShape s);
	public double[] getCenter();
	public long getDimension();
	public Region getMBR();
	public double getArea();
	public double getMinimumDistance(final IShape s);
} // IShape
