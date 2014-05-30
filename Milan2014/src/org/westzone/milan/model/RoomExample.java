package org.westzone.milan.model;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andVirtualRoomNumIsNull() {
            addCriterion("virtual_room_num is null");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumIsNotNull() {
            addCriterion("virtual_room_num is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumEqualTo(String value) {
            addCriterion("virtual_room_num =", value, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumNotEqualTo(String value) {
            addCriterion("virtual_room_num <>", value, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumGreaterThan(String value) {
            addCriterion("virtual_room_num >", value, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumGreaterThanOrEqualTo(String value) {
            addCriterion("virtual_room_num >=", value, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumLessThan(String value) {
            addCriterion("virtual_room_num <", value, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumLessThanOrEqualTo(String value) {
            addCriterion("virtual_room_num <=", value, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumLike(String value) {
            addCriterion("virtual_room_num like", value, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumNotLike(String value) {
            addCriterion("virtual_room_num not like", value, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumIn(List<String> values) {
            addCriterion("virtual_room_num in", values, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumNotIn(List<String> values) {
            addCriterion("virtual_room_num not in", values, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumBetween(String value1, String value2) {
            addCriterion("virtual_room_num between", value1, value2, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andVirtualRoomNumNotBetween(String value1, String value2) {
            addCriterion("virtual_room_num not between", value1, value2, "virtualRoomNum");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNull() {
            addCriterion("hotel_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNotNull() {
            addCriterion("hotel_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNameEqualTo(String value) {
            addCriterion("hotel_name =", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotEqualTo(String value) {
            addCriterion("hotel_name <>", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThan(String value) {
            addCriterion("hotel_name >", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_name >=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThan(String value) {
            addCriterion("hotel_name <", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_name <=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLike(String value) {
            addCriterion("hotel_name like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotLike(String value) {
            addCriterion("hotel_name not like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameIn(List<String> values) {
            addCriterion("hotel_name in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotIn(List<String> values) {
            addCriterion("hotel_name not in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameBetween(String value1, String value2) {
            addCriterion("hotel_name between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotBetween(String value1, String value2) {
            addCriterion("hotel_name not between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("room_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("room_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(Integer value) {
            addCriterion("room_num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(Integer value) {
            addCriterion("room_num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(Integer value) {
            addCriterion("room_num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(Integer value) {
            addCriterion("room_num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(Integer value) {
            addCriterion("room_num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<Integer> values) {
            addCriterion("room_num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<Integer> values) {
            addCriterion("room_num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(Integer value1, Integer value2) {
            addCriterion("room_num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("room_num not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andAvailableThurIsNull() {
            addCriterion("available_thur is null");
            return (Criteria) this;
        }

        public Criteria andAvailableThurIsNotNull() {
            addCriterion("available_thur is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableThurEqualTo(String value) {
            addCriterion("available_thur =", value, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurNotEqualTo(String value) {
            addCriterion("available_thur <>", value, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurGreaterThan(String value) {
            addCriterion("available_thur >", value, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurGreaterThanOrEqualTo(String value) {
            addCriterion("available_thur >=", value, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurLessThan(String value) {
            addCriterion("available_thur <", value, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurLessThanOrEqualTo(String value) {
            addCriterion("available_thur <=", value, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurLike(String value) {
            addCriterion("available_thur like", value, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurNotLike(String value) {
            addCriterion("available_thur not like", value, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurIn(List<String> values) {
            addCriterion("available_thur in", values, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurNotIn(List<String> values) {
            addCriterion("available_thur not in", values, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurBetween(String value1, String value2) {
            addCriterion("available_thur between", value1, value2, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableThurNotBetween(String value1, String value2) {
            addCriterion("available_thur not between", value1, value2, "availableThur");
            return (Criteria) this;
        }

        public Criteria andAvailableFriIsNull() {
            addCriterion("available_fri is null");
            return (Criteria) this;
        }

        public Criteria andAvailableFriIsNotNull() {
            addCriterion("available_fri is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableFriEqualTo(String value) {
            addCriterion("available_fri =", value, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriNotEqualTo(String value) {
            addCriterion("available_fri <>", value, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriGreaterThan(String value) {
            addCriterion("available_fri >", value, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriGreaterThanOrEqualTo(String value) {
            addCriterion("available_fri >=", value, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriLessThan(String value) {
            addCriterion("available_fri <", value, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriLessThanOrEqualTo(String value) {
            addCriterion("available_fri <=", value, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriLike(String value) {
            addCriterion("available_fri like", value, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriNotLike(String value) {
            addCriterion("available_fri not like", value, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriIn(List<String> values) {
            addCriterion("available_fri in", values, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriNotIn(List<String> values) {
            addCriterion("available_fri not in", values, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriBetween(String value1, String value2) {
            addCriterion("available_fri between", value1, value2, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableFriNotBetween(String value1, String value2) {
            addCriterion("available_fri not between", value1, value2, "availableFri");
            return (Criteria) this;
        }

        public Criteria andAvailableSatIsNull() {
            addCriterion("available_sat is null");
            return (Criteria) this;
        }

        public Criteria andAvailableSatIsNotNull() {
            addCriterion("available_sat is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableSatEqualTo(String value) {
            addCriterion("available_sat =", value, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatNotEqualTo(String value) {
            addCriterion("available_sat <>", value, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatGreaterThan(String value) {
            addCriterion("available_sat >", value, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatGreaterThanOrEqualTo(String value) {
            addCriterion("available_sat >=", value, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatLessThan(String value) {
            addCriterion("available_sat <", value, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatLessThanOrEqualTo(String value) {
            addCriterion("available_sat <=", value, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatLike(String value) {
            addCriterion("available_sat like", value, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatNotLike(String value) {
            addCriterion("available_sat not like", value, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatIn(List<String> values) {
            addCriterion("available_sat in", values, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatNotIn(List<String> values) {
            addCriterion("available_sat not in", values, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatBetween(String value1, String value2) {
            addCriterion("available_sat between", value1, value2, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSatNotBetween(String value1, String value2) {
            addCriterion("available_sat not between", value1, value2, "availableSat");
            return (Criteria) this;
        }

        public Criteria andAvailableSunIsNull() {
            addCriterion("available_sun is null");
            return (Criteria) this;
        }

        public Criteria andAvailableSunIsNotNull() {
            addCriterion("available_sun is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableSunEqualTo(String value) {
            addCriterion("available_sun =", value, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunNotEqualTo(String value) {
            addCriterion("available_sun <>", value, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunGreaterThan(String value) {
            addCriterion("available_sun >", value, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunGreaterThanOrEqualTo(String value) {
            addCriterion("available_sun >=", value, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunLessThan(String value) {
            addCriterion("available_sun <", value, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunLessThanOrEqualTo(String value) {
            addCriterion("available_sun <=", value, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunLike(String value) {
            addCriterion("available_sun like", value, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunNotLike(String value) {
            addCriterion("available_sun not like", value, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunIn(List<String> values) {
            addCriterion("available_sun in", values, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunNotIn(List<String> values) {
            addCriterion("available_sun not in", values, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunBetween(String value1, String value2) {
            addCriterion("available_sun between", value1, value2, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableSunNotBetween(String value1, String value2) {
            addCriterion("available_sun not between", value1, value2, "availableSun");
            return (Criteria) this;
        }

        public Criteria andAvailableMonIsNull() {
            addCriterion("available_mon is null");
            return (Criteria) this;
        }

        public Criteria andAvailableMonIsNotNull() {
            addCriterion("available_mon is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableMonEqualTo(String value) {
            addCriterion("available_mon =", value, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonNotEqualTo(String value) {
            addCriterion("available_mon <>", value, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonGreaterThan(String value) {
            addCriterion("available_mon >", value, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonGreaterThanOrEqualTo(String value) {
            addCriterion("available_mon >=", value, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonLessThan(String value) {
            addCriterion("available_mon <", value, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonLessThanOrEqualTo(String value) {
            addCriterion("available_mon <=", value, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonLike(String value) {
            addCriterion("available_mon like", value, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonNotLike(String value) {
            addCriterion("available_mon not like", value, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonIn(List<String> values) {
            addCriterion("available_mon in", values, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonNotIn(List<String> values) {
            addCriterion("available_mon not in", values, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonBetween(String value1, String value2) {
            addCriterion("available_mon between", value1, value2, "availableMon");
            return (Criteria) this;
        }

        public Criteria andAvailableMonNotBetween(String value1, String value2) {
            addCriterion("available_mon not between", value1, value2, "availableMon");
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