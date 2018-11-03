package cn.axy.xc.xcitemshowprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrnamentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrnamentsExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("o_id like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("o_id not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
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

        public Criteria andOSizeIsNull() {
            addCriterion("o_size is null");
            return (Criteria) this;
        }

        public Criteria andOSizeIsNotNull() {
            addCriterion("o_size is not null");
            return (Criteria) this;
        }

        public Criteria andOSizeEqualTo(Double value) {
            addCriterion("o_size =", value, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeNotEqualTo(Double value) {
            addCriterion("o_size <>", value, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeGreaterThan(Double value) {
            addCriterion("o_size >", value, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("o_size >=", value, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeLessThan(Double value) {
            addCriterion("o_size <", value, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeLessThanOrEqualTo(Double value) {
            addCriterion("o_size <=", value, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeIn(List<Double> values) {
            addCriterion("o_size in", values, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeNotIn(List<Double> values) {
            addCriterion("o_size not in", values, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeBetween(Double value1, Double value2) {
            addCriterion("o_size between", value1, value2, "oSize");
            return (Criteria) this;
        }

        public Criteria andOSizeNotBetween(Double value1, Double value2) {
            addCriterion("o_size not between", value1, value2, "oSize");
            return (Criteria) this;
        }

        public Criteria andOColorIsNull() {
            addCriterion("o_color is null");
            return (Criteria) this;
        }

        public Criteria andOColorIsNotNull() {
            addCriterion("o_color is not null");
            return (Criteria) this;
        }

        public Criteria andOColorEqualTo(String value) {
            addCriterion("o_color =", value, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorNotEqualTo(String value) {
            addCriterion("o_color <>", value, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorGreaterThan(String value) {
            addCriterion("o_color >", value, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorGreaterThanOrEqualTo(String value) {
            addCriterion("o_color >=", value, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorLessThan(String value) {
            addCriterion("o_color <", value, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorLessThanOrEqualTo(String value) {
            addCriterion("o_color <=", value, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorLike(String value) {
            addCriterion("o_color like", value, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorNotLike(String value) {
            addCriterion("o_color not like", value, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorIn(List<String> values) {
            addCriterion("o_color in", values, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorNotIn(List<String> values) {
            addCriterion("o_color not in", values, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorBetween(String value1, String value2) {
            addCriterion("o_color between", value1, value2, "oColor");
            return (Criteria) this;
        }

        public Criteria andOColorNotBetween(String value1, String value2) {
            addCriterion("o_color not between", value1, value2, "oColor");
            return (Criteria) this;
        }

        public Criteria andOCountIsNull() {
            addCriterion("o_count is null");
            return (Criteria) this;
        }

        public Criteria andOCountIsNotNull() {
            addCriterion("o_count is not null");
            return (Criteria) this;
        }

        public Criteria andOCountEqualTo(Double value) {
            addCriterion("o_count =", value, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountNotEqualTo(Double value) {
            addCriterion("o_count <>", value, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountGreaterThan(Double value) {
            addCriterion("o_count >", value, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountGreaterThanOrEqualTo(Double value) {
            addCriterion("o_count >=", value, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountLessThan(Double value) {
            addCriterion("o_count <", value, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountLessThanOrEqualTo(Double value) {
            addCriterion("o_count <=", value, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountIn(List<Double> values) {
            addCriterion("o_count in", values, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountNotIn(List<Double> values) {
            addCriterion("o_count not in", values, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountBetween(Double value1, Double value2) {
            addCriterion("o_count between", value1, value2, "oCount");
            return (Criteria) this;
        }

        public Criteria andOCountNotBetween(Double value1, Double value2) {
            addCriterion("o_count not between", value1, value2, "oCount");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNull() {
            addCriterion("o_price is null");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNotNull() {
            addCriterion("o_price is not null");
            return (Criteria) this;
        }

        public Criteria andOPriceEqualTo(Double value) {
            addCriterion("o_price =", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotEqualTo(Double value) {
            addCriterion("o_price <>", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThan(Double value) {
            addCriterion("o_price >", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("o_price >=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThan(Double value) {
            addCriterion("o_price <", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThanOrEqualTo(Double value) {
            addCriterion("o_price <=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceIn(List<Double> values) {
            addCriterion("o_price in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotIn(List<Double> values) {
            addCriterion("o_price not in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceBetween(Double value1, Double value2) {
            addCriterion("o_price between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotBetween(Double value1, Double value2) {
            addCriterion("o_price not between", value1, value2, "oPrice");
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