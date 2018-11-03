package cn.axy.xc.xcitemshowprovider.pojo;

import java.util.ArrayList;
import java.util.List;

public class AppliancesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppliancesExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(String value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(String value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(String value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(String value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(String value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(String value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLike(String value) {
            addCriterion("a_id like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotLike(String value) {
            addCriterion("a_id not like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<String> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<String> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(String value1, String value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(String value1, String value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andASizeIsNull() {
            addCriterion("a_size is null");
            return (Criteria) this;
        }

        public Criteria andASizeIsNotNull() {
            addCriterion("a_size is not null");
            return (Criteria) this;
        }

        public Criteria andASizeEqualTo(Double value) {
            addCriterion("a_size =", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeNotEqualTo(Double value) {
            addCriterion("a_size <>", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeGreaterThan(Double value) {
            addCriterion("a_size >", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeGreaterThanOrEqualTo(Double value) {
            addCriterion("a_size >=", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeLessThan(Double value) {
            addCriterion("a_size <", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeLessThanOrEqualTo(Double value) {
            addCriterion("a_size <=", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeIn(List<Double> values) {
            addCriterion("a_size in", values, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeNotIn(List<Double> values) {
            addCriterion("a_size not in", values, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeBetween(Double value1, Double value2) {
            addCriterion("a_size between", value1, value2, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeNotBetween(Double value1, Double value2) {
            addCriterion("a_size not between", value1, value2, "aSize");
            return (Criteria) this;
        }

        public Criteria andAColorIsNull() {
            addCriterion("a_color is null");
            return (Criteria) this;
        }

        public Criteria andAColorIsNotNull() {
            addCriterion("a_color is not null");
            return (Criteria) this;
        }

        public Criteria andAColorEqualTo(String value) {
            addCriterion("a_color =", value, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorNotEqualTo(String value) {
            addCriterion("a_color <>", value, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorGreaterThan(String value) {
            addCriterion("a_color >", value, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorGreaterThanOrEqualTo(String value) {
            addCriterion("a_color >=", value, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorLessThan(String value) {
            addCriterion("a_color <", value, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorLessThanOrEqualTo(String value) {
            addCriterion("a_color <=", value, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorLike(String value) {
            addCriterion("a_color like", value, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorNotLike(String value) {
            addCriterion("a_color not like", value, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorIn(List<String> values) {
            addCriterion("a_color in", values, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorNotIn(List<String> values) {
            addCriterion("a_color not in", values, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorBetween(String value1, String value2) {
            addCriterion("a_color between", value1, value2, "aColor");
            return (Criteria) this;
        }

        public Criteria andAColorNotBetween(String value1, String value2) {
            addCriterion("a_color not between", value1, value2, "aColor");
            return (Criteria) this;
        }

        public Criteria andAPriceIsNull() {
            addCriterion("a_price is null");
            return (Criteria) this;
        }

        public Criteria andAPriceIsNotNull() {
            addCriterion("a_price is not null");
            return (Criteria) this;
        }

        public Criteria andAPriceEqualTo(Double value) {
            addCriterion("a_price =", value, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceNotEqualTo(Double value) {
            addCriterion("a_price <>", value, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceGreaterThan(Double value) {
            addCriterion("a_price >", value, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("a_price >=", value, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceLessThan(Double value) {
            addCriterion("a_price <", value, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceLessThanOrEqualTo(Double value) {
            addCriterion("a_price <=", value, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceIn(List<Double> values) {
            addCriterion("a_price in", values, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceNotIn(List<Double> values) {
            addCriterion("a_price not in", values, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceBetween(Double value1, Double value2) {
            addCriterion("a_price between", value1, value2, "aPrice");
            return (Criteria) this;
        }

        public Criteria andAPriceNotBetween(Double value1, Double value2) {
            addCriterion("a_price not between", value1, value2, "aPrice");
            return (Criteria) this;
        }

        public Criteria andACountIsNull() {
            addCriterion("a_count is null");
            return (Criteria) this;
        }

        public Criteria andACountIsNotNull() {
            addCriterion("a_count is not null");
            return (Criteria) this;
        }

        public Criteria andACountEqualTo(Double value) {
            addCriterion("a_count =", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotEqualTo(Double value) {
            addCriterion("a_count <>", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountGreaterThan(Double value) {
            addCriterion("a_count >", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountGreaterThanOrEqualTo(Double value) {
            addCriterion("a_count >=", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountLessThan(Double value) {
            addCriterion("a_count <", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountLessThanOrEqualTo(Double value) {
            addCriterion("a_count <=", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountIn(List<Double> values) {
            addCriterion("a_count in", values, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotIn(List<Double> values) {
            addCriterion("a_count not in", values, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountBetween(Double value1, Double value2) {
            addCriterion("a_count between", value1, value2, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotBetween(Double value1, Double value2) {
            addCriterion("a_count not between", value1, value2, "aCount");
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