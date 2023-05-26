package pratham_talele;

import java.util.Objects;

public class Data_talele {

	private int catId;
    private String categoryName;
    private String categoryDesc;
    private String categoryimageUrl;
    
    public  Data_talele(int catId, String categoryName, String categoryDesc, String categoryimageUrl) {
    	this.catId = catId; 
    	this.categoryName = categoryName;
    	this.categoryDesc = categoryDesc;
    	this.categoryimageUrl = categoryimageUrl;
    }

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCategoryimageUrl() {
		return categoryimageUrl;
	}

	public void setCategoryimageUrl(String categoryimageUrl) {
		this.categoryimageUrl = categoryimageUrl;
	}
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Data_talele category = (Data_talele) o;
	        return catId == category.catId &&
	                categoryName.equals(category.categoryName) &&
	                categoryDesc.equals(category.categoryDesc) &&
	                categoryimageUrl.equals(category.categoryimageUrl);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(catId, categoryName, categoryDesc, categoryimageUrl);
	    }
	}


