package org.nioun.essentials.timlife.model.paging;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PageArray {
	


	    private List<List<String>> data;
	    private int recordsFiltered;
	    private int recordsTotal;
	    private int draw;
	

}
