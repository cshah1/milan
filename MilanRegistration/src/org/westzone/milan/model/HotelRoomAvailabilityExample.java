package org.westzone.milan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HotelRoomAvailabilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelRoomAvailabilityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andHotelRoomIDIsNull() {
            addCriterion("hotelRoomID is null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDIsNotNull() {
            addCriterion("hotelRoomID is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDEqualTo(Integer value) {
            addCriterion("hotelRoomID =", value, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDNotEqualTo(Integer value) {
            addCriterion("hotelRoomID <>", value, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDGreaterThan(Integer value) {
            addCriterion("hotelRoomID >", value, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelRoomID >=", value, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDLessThan(Integer value) {
            addCriterion("hotelRoomID <", value, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDLessThanOrEqualTo(Integer value) {
            addCriterion("hotelRoomID <=", value, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDIn(List<Integer> values) {
            addCriterion("hotelRoomID in", values, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDNotIn(List<Integer> values) {
            addCriterion("hotelRoomID not in", values, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDBetween(Integer value1, Integer value2) {
            addCriterion("hotelRoomID between", value1, value2, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andHotelRoomIDNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelRoomID not between", value1, value2, "hotelRoomID");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNull() {
            addCriterion("isFull is null");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNotNull() {
            addCriterion("isFull is not null");
            return (Criteria) this;
        }

        public Criteria andIsFullEqualTo(Boolean value) {
            addCriterion("isFull =", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotEqualTo(Boolean value) {
            addCriterion("isFull <>", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThan(Boolean value) {
            addCriterion("isFull >", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isFull >=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThan(Boolean value) {
            addCriterion("isFull <", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThanOrEqualTo(Boolean value) {
            addCriterion("isFull <=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullIn(List<Boolean> values) {
            addCriterion("isFull in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotIn(List<Boolean> values) {
            addCriterion("isFull not in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullBetween(Boolean value1, Boolean value2) {
            addCriterion("isFull between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isFull not between", value1, value2, "isFull");
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