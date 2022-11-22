https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package unit;

import java.util.HashSet;

public class NodeStatistic
{

  public NodeStatistic()
  {
  }

  public double _intersectingRatio = -1;

  public int _numberOfObjects = -1;

  public HashSet< Integer > _intersectingObjectSet = null;

  public HashSet< Integer > _nonIntersectingObjectSet = null;

  
  
  public void clear()
  {
    if ( _intersectingObjectSet != null )
    {
      _intersectingObjectSet.clear();
    }
    if ( _nonIntersectingObjectSet != null )
    {
      _nonIntersectingObjectSet.clear();
    }
  }
  
  public String toString()
  {
    String s = "";
    if ( _intersectingObjectSet != null )
      s += "intersecting objects : "  + _intersectingObjectSet.toString() + "\n";
    
    if ( _nonIntersectingObjectSet != null )
      s += "nonIntersectings objects : "  + _nonIntersectingObjectSet.toString() + "\n";
    
    return s;
  }
  
  
  
  
}
