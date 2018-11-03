package cn.axy.xc.xcitemshowprovider.pojo;

import java.util.Date;

public class SearchCategory {
    private String searchCategoryId;

    private Long searchCategoryParentId;

    private String searchCategoryName;

    private Integer searchCategoryStatus;

    private Integer searchCategorySortOrder;

    private Boolean searchCategoryIsParent;

    private Date searchCategoryCreated;

    private Date searchCategoryUpdated;

    private String searchCategoryDetails;

    public String getSearchCategoryId() {
        return searchCategoryId;
    }

    public void setSearchCategoryId(String searchCategoryId) {
        this.searchCategoryId = searchCategoryId == null ? null : searchCategoryId.trim();
    }

    public Long getSearchCategoryParentId() {
        return searchCategoryParentId;
    }

    public void setSearchCategoryParentId(Long searchCategoryParentId) {
        this.searchCategoryParentId = searchCategoryParentId;
    }

    public String getSearchCategoryName() {
        return searchCategoryName;
    }

    public void setSearchCategoryName(String searchCategoryName) {
        this.searchCategoryName = searchCategoryName == null ? null : searchCategoryName.trim();
    }

    public Integer getSearchCategoryStatus() {
        return searchCategoryStatus;
    }

    public void setSearchCategoryStatus(Integer searchCategoryStatus) {
        this.searchCategoryStatus = searchCategoryStatus;
    }

    public Integer getSearchCategorySortOrder() {
        return searchCategorySortOrder;
    }

    public void setSearchCategorySortOrder(Integer searchCategorySortOrder) {
        this.searchCategorySortOrder = searchCategorySortOrder;
    }

    public Boolean getSearchCategoryIsParent() {
        return searchCategoryIsParent;
    }

    public void setSearchCategoryIsParent(Boolean searchCategoryIsParent) {
        this.searchCategoryIsParent = searchCategoryIsParent;
    }

    public Date getSearchCategoryCreated() {
        return searchCategoryCreated;
    }

    public void setSearchCategoryCreated(Date searchCategoryCreated) {
        this.searchCategoryCreated = searchCategoryCreated;
    }

    public Date getSearchCategoryUpdated() {
        return searchCategoryUpdated;
    }

    public void setSearchCategoryUpdated(Date searchCategoryUpdated) {
        this.searchCategoryUpdated = searchCategoryUpdated;
    }

    public String getSearchCategoryDetails() {
        return searchCategoryDetails;
    }

    public void setSearchCategoryDetails(String searchCategoryDetails) {
        this.searchCategoryDetails = searchCategoryDetails == null ? null : searchCategoryDetails.trim();
    }
}