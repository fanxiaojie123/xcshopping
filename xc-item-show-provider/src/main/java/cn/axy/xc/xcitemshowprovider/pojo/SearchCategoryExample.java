package cn.axy.xc.xcitemshowprovider.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SearchCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSearchCategoryIdIsNull() {
            addCriterion("search_category_id is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdIsNotNull() {
            addCriterion("search_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdEqualTo(String value) {
            addCriterion("search_category_id =", value, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdNotEqualTo(String value) {
            addCriterion("search_category_id <>", value, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdGreaterThan(String value) {
            addCriterion("search_category_id >", value, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("search_category_id >=", value, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdLessThan(String value) {
            addCriterion("search_category_id <", value, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("search_category_id <=", value, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdLike(String value) {
            addCriterion("search_category_id like", value, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdNotLike(String value) {
            addCriterion("search_category_id not like", value, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdIn(List<String> values) {
            addCriterion("search_category_id in", values, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdNotIn(List<String> values) {
            addCriterion("search_category_id not in", values, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdBetween(String value1, String value2) {
            addCriterion("search_category_id between", value1, value2, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIdNotBetween(String value1, String value2) {
            addCriterion("search_category_id not between", value1, value2, "searchCategoryId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdIsNull() {
            addCriterion("search_category_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdIsNotNull() {
            addCriterion("search_category_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdEqualTo(Long value) {
            addCriterion("search_category_parent_id =", value, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdNotEqualTo(Long value) {
            addCriterion("search_category_parent_id <>", value, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdGreaterThan(Long value) {
            addCriterion("search_category_parent_id >", value, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("search_category_parent_id >=", value, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdLessThan(Long value) {
            addCriterion("search_category_parent_id <", value, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdLessThanOrEqualTo(Long value) {
            addCriterion("search_category_parent_id <=", value, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdIn(List<Long> values) {
            addCriterion("search_category_parent_id in", values, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdNotIn(List<Long> values) {
            addCriterion("search_category_parent_id not in", values, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdBetween(Long value1, Long value2) {
            addCriterion("search_category_parent_id between", value1, value2, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryParentIdNotBetween(Long value1, Long value2) {
            addCriterion("search_category_parent_id not between", value1, value2, "searchCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameIsNull() {
            addCriterion("search_category_name is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameIsNotNull() {
            addCriterion("search_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameEqualTo(String value) {
            addCriterion("search_category_name =", value, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameNotEqualTo(String value) {
            addCriterion("search_category_name <>", value, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameGreaterThan(String value) {
            addCriterion("search_category_name >", value, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("search_category_name >=", value, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameLessThan(String value) {
            addCriterion("search_category_name <", value, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("search_category_name <=", value, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameLike(String value) {
            addCriterion("search_category_name like", value, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameNotLike(String value) {
            addCriterion("search_category_name not like", value, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameIn(List<String> values) {
            addCriterion("search_category_name in", values, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameNotIn(List<String> values) {
            addCriterion("search_category_name not in", values, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameBetween(String value1, String value2) {
            addCriterion("search_category_name between", value1, value2, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryNameNotBetween(String value1, String value2) {
            addCriterion("search_category_name not between", value1, value2, "searchCategoryName");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusIsNull() {
            addCriterion("search_category_status is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusIsNotNull() {
            addCriterion("search_category_status is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusEqualTo(Integer value) {
            addCriterion("search_category_status =", value, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusNotEqualTo(Integer value) {
            addCriterion("search_category_status <>", value, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusGreaterThan(Integer value) {
            addCriterion("search_category_status >", value, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_category_status >=", value, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusLessThan(Integer value) {
            addCriterion("search_category_status <", value, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("search_category_status <=", value, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusIn(List<Integer> values) {
            addCriterion("search_category_status in", values, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusNotIn(List<Integer> values) {
            addCriterion("search_category_status not in", values, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("search_category_status between", value1, value2, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("search_category_status not between", value1, value2, "searchCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderIsNull() {
            addCriterion("search_category_sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderIsNotNull() {
            addCriterion("search_category_sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderEqualTo(Integer value) {
            addCriterion("search_category_sort_order =", value, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderNotEqualTo(Integer value) {
            addCriterion("search_category_sort_order <>", value, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderGreaterThan(Integer value) {
            addCriterion("search_category_sort_order >", value, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_category_sort_order >=", value, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderLessThan(Integer value) {
            addCriterion("search_category_sort_order <", value, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("search_category_sort_order <=", value, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderIn(List<Integer> values) {
            addCriterion("search_category_sort_order in", values, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderNotIn(List<Integer> values) {
            addCriterion("search_category_sort_order not in", values, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderBetween(Integer value1, Integer value2) {
            addCriterion("search_category_sort_order between", value1, value2, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategorySortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("search_category_sort_order not between", value1, value2, "searchCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentIsNull() {
            addCriterion("search_category_is_parent is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentIsNotNull() {
            addCriterion("search_category_is_parent is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentEqualTo(Boolean value) {
            addCriterion("search_category_is_parent =", value, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentNotEqualTo(Boolean value) {
            addCriterion("search_category_is_parent <>", value, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentGreaterThan(Boolean value) {
            addCriterion("search_category_is_parent >", value, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("search_category_is_parent >=", value, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentLessThan(Boolean value) {
            addCriterion("search_category_is_parent <", value, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentLessThanOrEqualTo(Boolean value) {
            addCriterion("search_category_is_parent <=", value, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentIn(List<Boolean> values) {
            addCriterion("search_category_is_parent in", values, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentNotIn(List<Boolean> values) {
            addCriterion("search_category_is_parent not in", values, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentBetween(Boolean value1, Boolean value2) {
            addCriterion("search_category_is_parent between", value1, value2, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryIsParentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("search_category_is_parent not between", value1, value2, "searchCategoryIsParent");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedIsNull() {
            addCriterion("search_category_created is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedIsNotNull() {
            addCriterion("search_category_created is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedEqualTo(Date value) {
            addCriterion("search_category_created =", value, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedNotEqualTo(Date value) {
            addCriterion("search_category_created <>", value, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedGreaterThan(Date value) {
            addCriterion("search_category_created >", value, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("search_category_created >=", value, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedLessThan(Date value) {
            addCriterion("search_category_created <", value, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedLessThanOrEqualTo(Date value) {
            addCriterion("search_category_created <=", value, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedIn(List<Date> values) {
            addCriterion("search_category_created in", values, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedNotIn(List<Date> values) {
            addCriterion("search_category_created not in", values, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedBetween(Date value1, Date value2) {
            addCriterion("search_category_created between", value1, value2, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryCreatedNotBetween(Date value1, Date value2) {
            addCriterion("search_category_created not between", value1, value2, "searchCategoryCreated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedIsNull() {
            addCriterion("search_category_updated is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedIsNotNull() {
            addCriterion("search_category_updated is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedEqualTo(Date value) {
            addCriterion("search_category_updated =", value, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedNotEqualTo(Date value) {
            addCriterion("search_category_updated <>", value, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedGreaterThan(Date value) {
            addCriterion("search_category_updated >", value, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("search_category_updated >=", value, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedLessThan(Date value) {
            addCriterion("search_category_updated <", value, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("search_category_updated <=", value, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedIn(List<Date> values) {
            addCriterion("search_category_updated in", values, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedNotIn(List<Date> values) {
            addCriterion("search_category_updated not in", values, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedBetween(Date value1, Date value2) {
            addCriterion("search_category_updated between", value1, value2, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("search_category_updated not between", value1, value2, "searchCategoryUpdated");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsIsNull() {
            addCriterion("search_category_details is null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsIsNotNull() {
            addCriterion("search_category_details is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsEqualTo(String value) {
            addCriterion("search_category_details =", value, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsNotEqualTo(String value) {
            addCriterion("search_category_details <>", value, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsGreaterThan(String value) {
            addCriterion("search_category_details >", value, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("search_category_details >=", value, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsLessThan(String value) {
            addCriterion("search_category_details <", value, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsLessThanOrEqualTo(String value) {
            addCriterion("search_category_details <=", value, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsLike(String value) {
            addCriterion("search_category_details like", value, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsNotLike(String value) {
            addCriterion("search_category_details not like", value, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsIn(List<String> values) {
            addCriterion("search_category_details in", values, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsNotIn(List<String> values) {
            addCriterion("search_category_details not in", values, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsBetween(String value1, String value2) {
            addCriterion("search_category_details between", value1, value2, "searchCategoryDetails");
            return (Criteria) this;
        }

        public Criteria andSearchCategoryDetailsNotBetween(String value1, String value2) {
            addCriterion("search_category_details not between", value1, value2, "searchCategoryDetails");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}