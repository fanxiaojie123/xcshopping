package cn.axy.xc.xcitemshowprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(String value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(String value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(String value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(String value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(String value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(String value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLike(String value) {
            addCriterion("m_id like", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotLike(String value) {
            addCriterion("m_id not like", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<String> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<String> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(String value1, String value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(String value1, String value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMPictureIsNull() {
            addCriterion("m_picture is null");
            return (Criteria) this;
        }

        public Criteria andMPictureIsNotNull() {
            addCriterion("m_picture is not null");
            return (Criteria) this;
        }

        public Criteria andMPictureEqualTo(String value) {
            addCriterion("m_picture =", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureNotEqualTo(String value) {
            addCriterion("m_picture <>", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureGreaterThan(String value) {
            addCriterion("m_picture >", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureGreaterThanOrEqualTo(String value) {
            addCriterion("m_picture >=", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureLessThan(String value) {
            addCriterion("m_picture <", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureLessThanOrEqualTo(String value) {
            addCriterion("m_picture <=", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureLike(String value) {
            addCriterion("m_picture like", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureNotLike(String value) {
            addCriterion("m_picture not like", value, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureIn(List<String> values) {
            addCriterion("m_picture in", values, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureNotIn(List<String> values) {
            addCriterion("m_picture not in", values, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureBetween(String value1, String value2) {
            addCriterion("m_picture between", value1, value2, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMPictureNotBetween(String value1, String value2) {
            addCriterion("m_picture not between", value1, value2, "mPicture");
            return (Criteria) this;
        }

        public Criteria andMParticularsIsNull() {
            addCriterion("m_particulars is null");
            return (Criteria) this;
        }

        public Criteria andMParticularsIsNotNull() {
            addCriterion("m_particulars is not null");
            return (Criteria) this;
        }

        public Criteria andMParticularsEqualTo(String value) {
            addCriterion("m_particulars =", value, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsNotEqualTo(String value) {
            addCriterion("m_particulars <>", value, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsGreaterThan(String value) {
            addCriterion("m_particulars >", value, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsGreaterThanOrEqualTo(String value) {
            addCriterion("m_particulars >=", value, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsLessThan(String value) {
            addCriterion("m_particulars <", value, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsLessThanOrEqualTo(String value) {
            addCriterion("m_particulars <=", value, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsLike(String value) {
            addCriterion("m_particulars like", value, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsNotLike(String value) {
            addCriterion("m_particulars not like", value, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsIn(List<String> values) {
            addCriterion("m_particulars in", values, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsNotIn(List<String> values) {
            addCriterion("m_particulars not in", values, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsBetween(String value1, String value2) {
            addCriterion("m_particulars between", value1, value2, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMParticularsNotBetween(String value1, String value2) {
            addCriterion("m_particulars not between", value1, value2, "mParticulars");
            return (Criteria) this;
        }

        public Criteria andMStatusIsNull() {
            addCriterion("m_status is null");
            return (Criteria) this;
        }

        public Criteria andMStatusIsNotNull() {
            addCriterion("m_status is not null");
            return (Criteria) this;
        }

        public Criteria andMStatusEqualTo(Integer value) {
            addCriterion("m_status =", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotEqualTo(Integer value) {
            addCriterion("m_status <>", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusGreaterThan(Integer value) {
            addCriterion("m_status >", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_status >=", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusLessThan(Integer value) {
            addCriterion("m_status <", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusLessThanOrEqualTo(Integer value) {
            addCriterion("m_status <=", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusIn(List<Integer> values) {
            addCriterion("m_status in", values, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotIn(List<Integer> values) {
            addCriterion("m_status not in", values, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusBetween(Integer value1, Integer value2) {
            addCriterion("m_status between", value1, value2, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("m_status not between", value1, value2, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMPointsIsNull() {
            addCriterion("m_points is null");
            return (Criteria) this;
        }

        public Criteria andMPointsIsNotNull() {
            addCriterion("m_points is not null");
            return (Criteria) this;
        }

        public Criteria andMPointsEqualTo(String value) {
            addCriterion("m_points =", value, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsNotEqualTo(String value) {
            addCriterion("m_points <>", value, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsGreaterThan(String value) {
            addCriterion("m_points >", value, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsGreaterThanOrEqualTo(String value) {
            addCriterion("m_points >=", value, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsLessThan(String value) {
            addCriterion("m_points <", value, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsLessThanOrEqualTo(String value) {
            addCriterion("m_points <=", value, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsLike(String value) {
            addCriterion("m_points like", value, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsNotLike(String value) {
            addCriterion("m_points not like", value, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsIn(List<String> values) {
            addCriterion("m_points in", values, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsNotIn(List<String> values) {
            addCriterion("m_points not in", values, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsBetween(String value1, String value2) {
            addCriterion("m_points between", value1, value2, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMPointsNotBetween(String value1, String value2) {
            addCriterion("m_points not between", value1, value2, "mPoints");
            return (Criteria) this;
        }

        public Criteria andMCreatedIsNull() {
            addCriterion("m_created is null");
            return (Criteria) this;
        }

        public Criteria andMCreatedIsNotNull() {
            addCriterion("m_created is not null");
            return (Criteria) this;
        }

        public Criteria andMCreatedEqualTo(String value) {
            addCriterion("m_created =", value, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedNotEqualTo(String value) {
            addCriterion("m_created <>", value, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedGreaterThan(String value) {
            addCriterion("m_created >", value, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("m_created >=", value, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedLessThan(String value) {
            addCriterion("m_created <", value, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedLessThanOrEqualTo(String value) {
            addCriterion("m_created <=", value, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedLike(String value) {
            addCriterion("m_created like", value, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedNotLike(String value) {
            addCriterion("m_created not like", value, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedIn(List<String> values) {
            addCriterion("m_created in", values, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedNotIn(List<String> values) {
            addCriterion("m_created not in", values, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedBetween(String value1, String value2) {
            addCriterion("m_created between", value1, value2, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMCreatedNotBetween(String value1, String value2) {
            addCriterion("m_created not between", value1, value2, "mCreated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedIsNull() {
            addCriterion("m_updated is null");
            return (Criteria) this;
        }

        public Criteria andMUpdatedIsNotNull() {
            addCriterion("m_updated is not null");
            return (Criteria) this;
        }

        public Criteria andMUpdatedEqualTo(String value) {
            addCriterion("m_updated =", value, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedNotEqualTo(String value) {
            addCriterion("m_updated <>", value, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedGreaterThan(String value) {
            addCriterion("m_updated >", value, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedGreaterThanOrEqualTo(String value) {
            addCriterion("m_updated >=", value, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedLessThan(String value) {
            addCriterion("m_updated <", value, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedLessThanOrEqualTo(String value) {
            addCriterion("m_updated <=", value, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedLike(String value) {
            addCriterion("m_updated like", value, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedNotLike(String value) {
            addCriterion("m_updated not like", value, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedIn(List<String> values) {
            addCriterion("m_updated in", values, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedNotIn(List<String> values) {
            addCriterion("m_updated not in", values, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedBetween(String value1, String value2) {
            addCriterion("m_updated between", value1, value2, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andMUpdatedNotBetween(String value1, String value2) {
            addCriterion("m_updated not between", value1, value2, "mUpdated");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("s_id like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("s_id not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andMBrandIsNull() {
            addCriterion("m_brand is null");
            return (Criteria) this;
        }

        public Criteria andMBrandIsNotNull() {
            addCriterion("m_brand is not null");
            return (Criteria) this;
        }

        public Criteria andMBrandEqualTo(String value) {
            addCriterion("m_brand =", value, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandNotEqualTo(String value) {
            addCriterion("m_brand <>", value, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandGreaterThan(String value) {
            addCriterion("m_brand >", value, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandGreaterThanOrEqualTo(String value) {
            addCriterion("m_brand >=", value, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandLessThan(String value) {
            addCriterion("m_brand <", value, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandLessThanOrEqualTo(String value) {
            addCriterion("m_brand <=", value, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandLike(String value) {
            addCriterion("m_brand like", value, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandNotLike(String value) {
            addCriterion("m_brand not like", value, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandIn(List<String> values) {
            addCriterion("m_brand in", values, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandNotIn(List<String> values) {
            addCriterion("m_brand not in", values, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandBetween(String value1, String value2) {
            addCriterion("m_brand between", value1, value2, "mBrand");
            return (Criteria) this;
        }

        public Criteria andMBrandNotBetween(String value1, String value2) {
            addCriterion("m_brand not between", value1, value2, "mBrand");
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