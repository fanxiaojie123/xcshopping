package cn.axy.xc.xcitemshowprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class SellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerExample() {
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

        public Criteria andSPwdIsNull() {
            addCriterion("s_pwd is null");
            return (Criteria) this;
        }

        public Criteria andSPwdIsNotNull() {
            addCriterion("s_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andSPwdEqualTo(String value) {
            addCriterion("s_pwd =", value, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdNotEqualTo(String value) {
            addCriterion("s_pwd <>", value, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdGreaterThan(String value) {
            addCriterion("s_pwd >", value, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdGreaterThanOrEqualTo(String value) {
            addCriterion("s_pwd >=", value, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdLessThan(String value) {
            addCriterion("s_pwd <", value, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdLessThanOrEqualTo(String value) {
            addCriterion("s_pwd <=", value, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdLike(String value) {
            addCriterion("s_pwd like", value, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdNotLike(String value) {
            addCriterion("s_pwd not like", value, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdIn(List<String> values) {
            addCriterion("s_pwd in", values, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdNotIn(List<String> values) {
            addCriterion("s_pwd not in", values, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdBetween(String value1, String value2) {
            addCriterion("s_pwd between", value1, value2, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSPwdNotBetween(String value1, String value2) {
            addCriterion("s_pwd not between", value1, value2, "sPwd");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(Integer value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(Integer value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(Integer value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(Integer value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(Integer value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<Integer> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<Integer> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(Integer value1, Integer value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(Integer value1, Integer value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNull() {
            addCriterion("s_address is null");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNotNull() {
            addCriterion("s_address is not null");
            return (Criteria) this;
        }

        public Criteria andSAddressEqualTo(String value) {
            addCriterion("s_address =", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotEqualTo(String value) {
            addCriterion("s_address <>", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThan(String value) {
            addCriterion("s_address >", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThanOrEqualTo(String value) {
            addCriterion("s_address >=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThan(String value) {
            addCriterion("s_address <", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThanOrEqualTo(String value) {
            addCriterion("s_address <=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLike(String value) {
            addCriterion("s_address like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotLike(String value) {
            addCriterion("s_address not like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressIn(List<String> values) {
            addCriterion("s_address in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotIn(List<String> values) {
            addCriterion("s_address not in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressBetween(String value1, String value2) {
            addCriterion("s_address between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotBetween(String value1, String value2) {
            addCriterion("s_address not between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNull() {
            addCriterion("s_phone is null");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNotNull() {
            addCriterion("s_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSPhoneEqualTo(String value) {
            addCriterion("s_phone =", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotEqualTo(String value) {
            addCriterion("s_phone <>", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThan(String value) {
            addCriterion("s_phone >", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_phone >=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThan(String value) {
            addCriterion("s_phone <", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThanOrEqualTo(String value) {
            addCriterion("s_phone <=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLike(String value) {
            addCriterion("s_phone like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotLike(String value) {
            addCriterion("s_phone not like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneIn(List<String> values) {
            addCriterion("s_phone in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotIn(List<String> values) {
            addCriterion("s_phone not in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneBetween(String value1, String value2) {
            addCriterion("s_phone between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotBetween(String value1, String value2) {
            addCriterion("s_phone not between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSDescribeIsNull() {
            addCriterion("s_describe is null");
            return (Criteria) this;
        }

        public Criteria andSDescribeIsNotNull() {
            addCriterion("s_describe is not null");
            return (Criteria) this;
        }

        public Criteria andSDescribeEqualTo(String value) {
            addCriterion("s_describe =", value, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeNotEqualTo(String value) {
            addCriterion("s_describe <>", value, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeGreaterThan(String value) {
            addCriterion("s_describe >", value, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("s_describe >=", value, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeLessThan(String value) {
            addCriterion("s_describe <", value, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeLessThanOrEqualTo(String value) {
            addCriterion("s_describe <=", value, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeLike(String value) {
            addCriterion("s_describe like", value, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeNotLike(String value) {
            addCriterion("s_describe not like", value, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeIn(List<String> values) {
            addCriterion("s_describe in", values, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeNotIn(List<String> values) {
            addCriterion("s_describe not in", values, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeBetween(String value1, String value2) {
            addCriterion("s_describe between", value1, value2, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSDescribeNotBetween(String value1, String value2) {
            addCriterion("s_describe not between", value1, value2, "sDescribe");
            return (Criteria) this;
        }

        public Criteria andSPictureIsNull() {
            addCriterion("s_picture is null");
            return (Criteria) this;
        }

        public Criteria andSPictureIsNotNull() {
            addCriterion("s_picture is not null");
            return (Criteria) this;
        }

        public Criteria andSPictureEqualTo(String value) {
            addCriterion("s_picture =", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotEqualTo(String value) {
            addCriterion("s_picture <>", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureGreaterThan(String value) {
            addCriterion("s_picture >", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureGreaterThanOrEqualTo(String value) {
            addCriterion("s_picture >=", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLessThan(String value) {
            addCriterion("s_picture <", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLessThanOrEqualTo(String value) {
            addCriterion("s_picture <=", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureLike(String value) {
            addCriterion("s_picture like", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotLike(String value) {
            addCriterion("s_picture not like", value, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureIn(List<String> values) {
            addCriterion("s_picture in", values, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotIn(List<String> values) {
            addCriterion("s_picture not in", values, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureBetween(String value1, String value2) {
            addCriterion("s_picture between", value1, value2, "sPicture");
            return (Criteria) this;
        }

        public Criteria andSPictureNotBetween(String value1, String value2) {
            addCriterion("s_picture not between", value1, value2, "sPicture");
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