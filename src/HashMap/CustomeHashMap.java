package HashMap;

import java.util.LinkedList;

import LinkedList.Node;

public class CustomeHashMap {

	static class HashMap<K, V> {

		private class Node {

			K key;
			V value;

			public Node(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}

		private int n; // n - nodes
		private int N; // N - buckets
		private LinkedList<Node> bucket[];// N - buckets
		
		public HashMap(){
			
			this.N = 4 ;
			this.bucket = new LinkedList[4] ;
			
			for (int i = 0; i < bucket.length; i++) {
				
				bucket[i] = new LinkedList() ;
			}
		}

		private int hashKeyFucnction(K key) {

			int num = key.hashCode();

			return Math.abs(num) % N;

		}

		private int searchDataInLinkedList(K key, int bi) {

			LinkedList<HashMap<K, V>.Node> ll = bucket[bi];

			for (int i = 0; i < ll.size(); i++) {

				if (ll.get(i).key == key)
					return i;
			}
			return -1;
		}

		private void reHash() {

			LinkedList<Node>[] oldBucket = bucket;

			bucket = new LinkedList[N * 2];

			/*
			 * To copy Bucket
			 */
			for (int i = 0; i < N * 2; i++) {

				bucket[i] = oldBucket[i];
			}

			/*
			 * To copy Node Of LinkedList
			 * 
			 */

			for (int i = 0; i < oldBucket.length; i++) {

				LinkedList<Node> node = oldBucket[i];

				for (int j = 0; j < node.size(); j++) {
					Node newNode = node.get(j);
					put(newNode.key, newNode.value);
				}
			}

		}

		public void put(K key, V value) {

			int bi = hashKeyFucnction(key); // bi -> Bucket Index

			int di = searchDataInLinkedList(key, bi); // di Data INdex

			if (di == -1) { // key doesn't exist it is occuring for the 1st time

				bucket[bi].add(new Node(key, value));
				n++;
			} else {
				bucket[bi].get(di).value = value; // if the key is already exist increment the value by new value
			}

			double lambda = (double) n / N;

			if (lambda > bucket.length / 2)
				reHash();

		}

		public V get(K key) {

			int bi = hashKeyFucnction(key);

			int di = searchDataInLinkedList(key, bi);

			if (di == -1)
				return null;
			else
				return bucket[bi].get(di).value;
		}

		public boolean containsKey(K key) {

			int bi = hashKeyFucnction(key);

			int di = searchDataInLinkedList(key, bi);

			if (di == -1)
				return false;
			else
				return true ;

		}
		
		public void remove(K key) {
			
			int bi = hashKeyFucnction(key);

			int di = searchDataInLinkedList(key, bi);
			
			if (di == -1)
				return ;
			else {
				bucket[bi].remove(di) ;
				n-- ;
			}
		}
		
		public String toString() {
			
			String op = "";
			
			for (int i = 0; i < bucket.length; i++) {
				
				 LinkedList<Node> ll = bucket[i] ;
				
				for(int j = 0 ; j < ll.size() ; j++) {
				
					op += "Key = "+bucket[i].get(j).key+" value = "+bucket[i].get(j).value+"\n" ;
				}
				
			}
			return op ;
		}

	}

}
