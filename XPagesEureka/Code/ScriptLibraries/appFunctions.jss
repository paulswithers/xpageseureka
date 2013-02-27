function clearMap( map:Map ){ // Get iterator for the keys
	var iterator = map.keySet().iterator();  // Remove all items 
	while( iterator.hasNext() ){  
		map.remove( iterator.next() ); 
	}
}

function showSLRow(){
	return true;
}