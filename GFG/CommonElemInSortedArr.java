Link - https://practice.geeksforgeeks.org/problems/common-elements1132/1

ArrayList<Integer> arrList = new ArrayList<Integer>();
        
TreeMap<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
TreeMap<Integer, Integer> map2 = new TreeMap<Integer, Integer>();
TreeMap<Integer, Integer> map3 = new TreeMap<Integer, Integer>();

for(int i=0; i<n1 ; i++){
	map1.put(A[i], 1);
}

for(int i=0; i<n2 ; i++){
	map2.put(B[i], 1);
}

for(int i=0; i<n3 ; i++){
	map3.put(C[i], 1);
}

for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
	int key = entry.getKey();
	if(map2.containsKey(key) && map3.containsKey(key)){
		arrList.add(new Integer(key));
	}
}

return arrList;