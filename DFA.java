/*
Given a binary string, decide whether it can be divided by int k
*/
	public int getRemainder(String s, int k){
	    	//generate DFA
	    	int[][] DFA=new int[k][2];
	    	int trans0=0;
	    	int trans1=0;
	    	int state;
	    	for(state=0;state<k;state++){
	    		trans0=state<<1;
	    		DFA[state][0]=(trans0<k)?trans0:trans0-k;
	    		trans1=(state<<1)+1;
	    		DFA[state][1]=(trans1<k)?trans1:trans1-k;
	    	}/*
	    	for(int i=0;i<k;i++){
	    		System.out.println(DFA[i][0]+"  "+DFA[i][1]);
	    	}*/
	    	
	    	int p=0;
	    	for(int i=0;i<s.length();i++){
	    		char c=s.charAt(i);
	    		p=DFA[p][c-'0'];
	    	}
	    	
	    	return p;
	    }
