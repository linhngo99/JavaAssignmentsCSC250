import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BinaryHeap
{
  private static final int d = 2;
  private int[] heap;
  private int heapSize;

  public BinaryHeap(int capacity){
      heapSize= 0;
      heap = new int[ capacity+1];
      Arrays.fill(heap, -1);}

  private int parent(int i){
    return (i-1)/d; }

  private int kthChild(int i,int k){
    return d*i+k; }

  public void insert(int x){
      heap[heapSize++] = x;
      heapifyUp(heapSize-1);}

  public int delete(int x){
    int key = heap[x];
    heap[x] = heap[heapSize-1];
    heapSize--;
    heapifyDown(x);
    return key;}

  public int findMin(){
    int key = heap[0];
    heap[0] = heap[heapSize-1];
    heapSize--;
    heapifyDown(0);
    return key;}

  private void heapifyUp(int i) {
    int temp = heap[i];
    while(i>0 && temp < heap[parent(i)]){
      heap[i] = heap[parent(i)];
      i= parent(i);}
    heap[i] = temp;}

  private void heapifyDown(int i){
    int child;
    int temp = heap[i];
    while(kthChild(i, 1) > heapSize){
      child = maxChild(i);
      if(temp > heap[child]){
        heap[i] = heap[child];
      }else break;
      i= child;
    }heap[i] = temp;
  }

  private int maxChild(int i) {
    int leftChild= kthChild(i, 1);
    int rightChild= kthChild(i, 2);
    return heap[leftChild]>heap[rightChild]?leftChild:rightChild;}

  public void printHeap(){
    System.out.print("\nHeap= ");
    for (int i= 0; i< heapSize; i++){
      System.out.print(heap[i] +" ");}
    System.out.println(); }


  public static void main (String[] args) {
    BinaryHeap minHeap= new BinaryHeap(12);
    minHeap.insert(11);
    minHeap.insert(7);
    minHeap.insert(2);
    minHeap.insert(4);
    minHeap.insert(8);
    minHeap.insert(9);
    minHeap.insert(6);
    minHeap.insert(10);
    minHeap.insert(5);
    minHeap.printHeap();
    minHeap.delete(0);
    System.out.println();
    System.out.print("Heap after deleting minimum");
    minHeap.printHeap();
    minHeap.insert(1);
    minHeap.insert(12);
    minHeap.insert(19);
    System.out.println();
    System.out.print("Heap after inserting 1, 9, 12");
    minHeap.printHeap();
  }



}
