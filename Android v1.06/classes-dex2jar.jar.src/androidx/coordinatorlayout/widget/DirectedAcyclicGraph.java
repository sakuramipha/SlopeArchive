package androidx.coordinatorlayout.widget;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class DirectedAcyclicGraph<T>
{
  private final SimpleArrayMap<T, ArrayList<T>> mGraph = new SimpleArrayMap();
  private final Pools.Pool<ArrayList<T>> mListPool = new Pools.SimplePool(10);
  private final ArrayList<T> mSortResult = new ArrayList();
  private final HashSet<T> mSortTmpMarked = new HashSet();
  
  private void dfs(T paramT, ArrayList<T> paramArrayList, HashSet<T> paramHashSet)
  {
    if (paramArrayList.contains(paramT)) {
      return;
    }
    if (!paramHashSet.contains(paramT))
    {
      paramHashSet.add(paramT);
      ArrayList localArrayList = (ArrayList)this.mGraph.get(paramT);
      if (localArrayList != null)
      {
        int i = 0;
        int j = localArrayList.size();
        while (i < j)
        {
          dfs(localArrayList.get(i), paramArrayList, paramHashSet);
          i++;
        }
      }
      paramHashSet.remove(paramT);
      paramArrayList.add(paramT);
      return;
    }
    throw new RuntimeException("This graph contains cyclic dependencies");
  }
  
  private ArrayList<T> getEmptyList()
  {
    ArrayList localArrayList2 = (ArrayList)this.mListPool.acquire();
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null) {
      localArrayList1 = new ArrayList();
    }
    return localArrayList1;
  }
  
  private void poolList(ArrayList<T> paramArrayList)
  {
    paramArrayList.clear();
    this.mListPool.release(paramArrayList);
  }
  
  public void addEdge(T paramT1, T paramT2)
  {
    if ((this.mGraph.containsKey(paramT1)) && (this.mGraph.containsKey(paramT2)))
    {
      ArrayList localArrayList2 = (ArrayList)this.mGraph.get(paramT1);
      ArrayList localArrayList1 = localArrayList2;
      if (localArrayList2 == null)
      {
        localArrayList1 = getEmptyList();
        this.mGraph.put(paramT1, localArrayList1);
      }
      localArrayList1.add(paramT2);
      return;
    }
    throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
  }
  
  public void addNode(T paramT)
  {
    if (!this.mGraph.containsKey(paramT)) {
      this.mGraph.put(paramT, null);
    }
  }
  
  public void clear()
  {
    int j = this.mGraph.size();
    for (int i = 0; i < j; i++)
    {
      ArrayList localArrayList = (ArrayList)this.mGraph.valueAt(i);
      if (localArrayList != null) {
        poolList(localArrayList);
      }
    }
    this.mGraph.clear();
  }
  
  public boolean contains(T paramT)
  {
    return this.mGraph.containsKey(paramT);
  }
  
  public List getIncomingEdges(T paramT)
  {
    return (List)this.mGraph.get(paramT);
  }
  
  public List<T> getOutgoingEdges(T paramT)
  {
    int j = this.mGraph.size();
    Object localObject1 = null;
    int i = 0;
    while (i < j)
    {
      ArrayList localArrayList = (ArrayList)this.mGraph.valueAt(i);
      Object localObject2 = localObject1;
      if (localArrayList != null)
      {
        localObject2 = localObject1;
        if (localArrayList.contains(paramT))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new ArrayList();
          }
          ((ArrayList)localObject2).add(this.mGraph.keyAt(i));
        }
      }
      i++;
      localObject1 = localObject2;
    }
    return (List<T>)localObject1;
  }
  
  public ArrayList<T> getSortedList()
  {
    this.mSortResult.clear();
    this.mSortTmpMarked.clear();
    int j = this.mGraph.size();
    for (int i = 0; i < j; i++) {
      dfs(this.mGraph.keyAt(i), this.mSortResult, this.mSortTmpMarked);
    }
    return this.mSortResult;
  }
  
  public boolean hasOutgoingEdges(T paramT)
  {
    int j = this.mGraph.size();
    for (int i = 0; i < j; i++)
    {
      ArrayList localArrayList = (ArrayList)this.mGraph.valueAt(i);
      if ((localArrayList != null) && (localArrayList.contains(paramT))) {
        return true;
      }
    }
    return false;
  }
  
  int size()
  {
    return this.mGraph.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\coordinatorlayout\widget\DirectedAcyclicGraph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */