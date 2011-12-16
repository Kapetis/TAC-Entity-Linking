package tac.kbp.queries;

import java.util.Comparator;

public class KBPQueryComparator implements Comparator<KBPQuery> {
    
	@Override
    public int compare(KBPQuery q1, KBPQuery q2) {
		
		final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
	    int value = 0;
	    
	    String[] query1_parts = q1.query_id.split("EL");			
	    String[] query2_parts = q2.query_id.split("EL");
	    
	    Integer qid1 = new Integer(Integer.parseInt(query1_parts[1]));
	    Integer qid2 = new Integer(Integer.parseInt(query2_parts[1]));

	    if (qid1 == qid2 ) value = EQUAL;
	    if (qid1 < qid2) value = AFTER;
	    if (qid1 > qid2) value= BEFORE;
	    
	    return value;
    }
}