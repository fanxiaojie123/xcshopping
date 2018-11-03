package cn.axy.xc.xcitemshowprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(String value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(String value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(String value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(String value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(String value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLike(String value) {
            addCriterion("f_id like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotLike(String value) {
            addCriterion("f_id not like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<String> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<String> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(String value1, String value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(String value1, String value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFSizeIsNull() {
            addCriterion("f_size is null");
            return (Criteria) this;
        }

        public Criteria andFSizeIsNotNull() {
            addCriterion("f_size is not null");
            return (Criteria) this;
        }

        public Criteria andFSizeEqualTo(Double value) {
            addCriterion("f_size =", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotEqualTo(Double value) {
            addCriterion("f_size <>", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeGreaterThan(Double value) {
            addCriterion("f_size >", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("f_size >=", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeLessThan(Double value) {
            addCriterion("f_size <", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeLessThanOrEqualTo(Double value) {
            addCriterion("f_size <=", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeIn(List<Double> values) {
            addCriterion("f_size in", values, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotIn(List<Double> values) {
            addCriterion("f_size not in", values, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeBetween(Double value1, Double value2) {
            addCriterion("f_size between", value1, value2, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotBetween(Double value1, Double value2) {
            addCriterion("f_size not between", value1, value2, "fSize");
            return (Criteria) this;
        }

        public Criteria andFColorIsNull() {
            addCriterion("f_color is null");
            return (Criteria) this;
        }

        public Criteria andFColorIsNotNull() {
            addCriterion("f_color is not null");
            return (Criteria) this;
        }

        public Criteria andFColorEqualTo(String value) {
            addCriterion("f_color =", value, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorNotEqualTo(String value) {
            addCriterion("f_color <>", value, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorGreaterThan(String value) {
            addCriterion("f_color >", value, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorGreaterThanOrEqualTo(String value) {
            addCriterion("f_color >=", value, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorLessThan(String value) {
            addCriterion("f_color <", value, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorLessThanOrEqualTo(String value) {
            addCriterion("f_color <=", value, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorLike(String value) {
            addCriterion("f_color like", value, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorNotLike(String value) {
            addCriterion("f_color not like", value, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorIn(List<String> values) {
            addCriterion("f_color in", values, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorNotIn(List<String> values) {
            addCriterion("f_color not in", values, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorBetween(String value1, String value2) {
            addCriterion("f_color between", value1, value2, "fColor");
            return (Criteria) this;
        }

        public Criteria andFColorNotBetween(String value1, String value2) {
            addCriterion("f_color not between", value1, value2, "fColor");
            return (Criteria) this;
        }

        public Criteria andFCountIsNull() {
            addCriterion("f_count is null");
            return (Criteria) this;
        }

        public Criteria andFCountIsNotNull() {
            addCriterion("f_count is not null");
            return (Criteria) this;
        }

        public Criteria andFCountEqualTo(String value) {
            addCriterion("f_count =", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountNotEqualTo(String value) {
            addCriterion("f_count <>", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountGreaterThan(String value) {
            addCriterion("f_count >", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountGreaterThanOrEqualTo(String value) {
            addCriterion("f_count >=", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountLessThan(String value) {
            addCriterion("f_count <", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountLessThanOrEqualTo(String value) {
            addCriterion("f_count <=", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountLike(String value) {
            addCriterion("f_count like", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountNotLike(String value) {
            addCriterion("f_count not like", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountIn(List<String> values) {
            addCriterion("f_count in", values, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountNotIn(List<String> values) {
            addCriterion("f_count not in", values, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountBetween(String value1, String value2) {
            addCriterion("f_count between", value1, value2, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountNotBetween(String value1, String value2) {
            addCriterion("f_count not between", value1, value2, "fCount");
            return (Criteria) this;
        }

        public Criteria andFPriceIsNull() {
            addCriterion("f_price is null");
            return (Criteria) this;
        }

        public Criteria andFPriceIsNotNull() {
            addCriterion("f_price is not null");
            return (Criteria) this;
        }

        public Criteria andFPriceEqualTo(Double value) {
            addCriterion("f_price =", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceNotEqualTo(Double value) {
            addCriterion("f_price <>", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceGreaterThan(Double value) {
            addCriterion("f_price >", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("f_price >=", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceLessThan(Double value) {
            addCriterion("f_price <", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceLessThanOrEqualTo(Double value) {
            addCriterion("f_price <=", value, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceIn(List<Double> values) {
            addCriterion("f_price in", values, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceNotIn(List<Double> values) {
            addCriterion("f_price not in", values, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceBetween(Double value1, Double value2) {
            addCriterion("f_price between", value1, value2, "fPrice");
            return (Criteria) this;
        }

        public Criteria andFPriceNotBetween(Double value1, Double value2) {
            addCriterion("f_price not between", value1, value2, "fPrice");
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