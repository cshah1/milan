package org.westzone.milan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMilanlocationIsNull() {
            addCriterion("milanlocation is null");
            return (Criteria) this;
        }

        public Criteria andMilanlocationIsNotNull() {
            addCriterion("milanlocation is not null");
            return (Criteria) this;
        }

        public Criteria andMilanlocationEqualTo(String value) {
            addCriterion("milanlocation =", value, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationNotEqualTo(String value) {
            addCriterion("milanlocation <>", value, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationGreaterThan(String value) {
            addCriterion("milanlocation >", value, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationGreaterThanOrEqualTo(String value) {
            addCriterion("milanlocation >=", value, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationLessThan(String value) {
            addCriterion("milanlocation <", value, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationLessThanOrEqualTo(String value) {
            addCriterion("milanlocation <=", value, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationLike(String value) {
            addCriterion("milanlocation like", value, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationNotLike(String value) {
            addCriterion("milanlocation not like", value, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationIn(List<String> values) {
            addCriterion("milanlocation in", values, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationNotIn(List<String> values) {
            addCriterion("milanlocation not in", values, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationBetween(String value1, String value2) {
            addCriterion("milanlocation between", value1, value2, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andMilanlocationNotBetween(String value1, String value2) {
            addCriterion("milanlocation not between", value1, value2, "milanlocation");
            return (Criteria) this;
        }

        public Criteria andZoneIsNull() {
            addCriterion("zone is null");
            return (Criteria) this;
        }

        public Criteria andZoneIsNotNull() {
            addCriterion("zone is not null");
            return (Criteria) this;
        }

        public Criteria andZoneEqualTo(String value) {
            addCriterion("zone =", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotEqualTo(String value) {
            addCriterion("zone <>", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThan(String value) {
            addCriterion("zone >", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThanOrEqualTo(String value) {
            addCriterion("zone >=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThan(String value) {
            addCriterion("zone <", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThanOrEqualTo(String value) {
            addCriterion("zone <=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLike(String value) {
            addCriterion("zone like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotLike(String value) {
            addCriterion("zone not like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneIn(List<String> values) {
            addCriterion("zone in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotIn(List<String> values) {
            addCriterion("zone not in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneBetween(String value1, String value2) {
            addCriterion("zone between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotBetween(String value1, String value2) {
            addCriterion("zone not between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andKendraIsNull() {
            addCriterion("kendra is null");
            return (Criteria) this;
        }

        public Criteria andKendraIsNotNull() {
            addCriterion("kendra is not null");
            return (Criteria) this;
        }

        public Criteria andKendraEqualTo(String value) {
            addCriterion("kendra =", value, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraNotEqualTo(String value) {
            addCriterion("kendra <>", value, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraGreaterThan(String value) {
            addCriterion("kendra >", value, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraGreaterThanOrEqualTo(String value) {
            addCriterion("kendra >=", value, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraLessThan(String value) {
            addCriterion("kendra <", value, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraLessThanOrEqualTo(String value) {
            addCriterion("kendra <=", value, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraLike(String value) {
            addCriterion("kendra like", value, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraNotLike(String value) {
            addCriterion("kendra not like", value, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraIn(List<String> values) {
            addCriterion("kendra in", values, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraNotIn(List<String> values) {
            addCriterion("kendra not in", values, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraBetween(String value1, String value2) {
            addCriterion("kendra between", value1, value2, "kendra");
            return (Criteria) this;
        }

        public Criteria andKendraNotBetween(String value1, String value2) {
            addCriterion("kendra not between", value1, value2, "kendra");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("fullname is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullname =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullname <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullname >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullname >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullname <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullname <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullname like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullname not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullname in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullname not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullname between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullname not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andAccfriIsNull() {
            addCriterion("accfri is null");
            return (Criteria) this;
        }

        public Criteria andAccfriIsNotNull() {
            addCriterion("accfri is not null");
            return (Criteria) this;
        }

        public Criteria andAccfriEqualTo(String value) {
            addCriterion("accfri =", value, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriNotEqualTo(String value) {
            addCriterion("accfri <>", value, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriGreaterThan(String value) {
            addCriterion("accfri >", value, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriGreaterThanOrEqualTo(String value) {
            addCriterion("accfri >=", value, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriLessThan(String value) {
            addCriterion("accfri <", value, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriLessThanOrEqualTo(String value) {
            addCriterion("accfri <=", value, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriLike(String value) {
            addCriterion("accfri like", value, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriNotLike(String value) {
            addCriterion("accfri not like", value, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriIn(List<String> values) {
            addCriterion("accfri in", values, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriNotIn(List<String> values) {
            addCriterion("accfri not in", values, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriBetween(String value1, String value2) {
            addCriterion("accfri between", value1, value2, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccfriNotBetween(String value1, String value2) {
            addCriterion("accfri not between", value1, value2, "accfri");
            return (Criteria) this;
        }

        public Criteria andAccsatIsNull() {
            addCriterion("accsat is null");
            return (Criteria) this;
        }

        public Criteria andAccsatIsNotNull() {
            addCriterion("accsat is not null");
            return (Criteria) this;
        }

        public Criteria andAccsatEqualTo(String value) {
            addCriterion("accsat =", value, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatNotEqualTo(String value) {
            addCriterion("accsat <>", value, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatGreaterThan(String value) {
            addCriterion("accsat >", value, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatGreaterThanOrEqualTo(String value) {
            addCriterion("accsat >=", value, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatLessThan(String value) {
            addCriterion("accsat <", value, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatLessThanOrEqualTo(String value) {
            addCriterion("accsat <=", value, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatLike(String value) {
            addCriterion("accsat like", value, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatNotLike(String value) {
            addCriterion("accsat not like", value, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatIn(List<String> values) {
            addCriterion("accsat in", values, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatNotIn(List<String> values) {
            addCriterion("accsat not in", values, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatBetween(String value1, String value2) {
            addCriterion("accsat between", value1, value2, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsatNotBetween(String value1, String value2) {
            addCriterion("accsat not between", value1, value2, "accsat");
            return (Criteria) this;
        }

        public Criteria andAccsunIsNull() {
            addCriterion("accsun is null");
            return (Criteria) this;
        }

        public Criteria andAccsunIsNotNull() {
            addCriterion("accsun is not null");
            return (Criteria) this;
        }

        public Criteria andAccsunEqualTo(String value) {
            addCriterion("accsun =", value, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunNotEqualTo(String value) {
            addCriterion("accsun <>", value, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunGreaterThan(String value) {
            addCriterion("accsun >", value, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunGreaterThanOrEqualTo(String value) {
            addCriterion("accsun >=", value, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunLessThan(String value) {
            addCriterion("accsun <", value, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunLessThanOrEqualTo(String value) {
            addCriterion("accsun <=", value, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunLike(String value) {
            addCriterion("accsun like", value, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunNotLike(String value) {
            addCriterion("accsun not like", value, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunIn(List<String> values) {
            addCriterion("accsun in", values, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunNotIn(List<String> values) {
            addCriterion("accsun not in", values, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunBetween(String value1, String value2) {
            addCriterion("accsun between", value1, value2, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccsunNotBetween(String value1, String value2) {
            addCriterion("accsun not between", value1, value2, "accsun");
            return (Criteria) this;
        }

        public Criteria andAccmonIsNull() {
            addCriterion("accmon is null");
            return (Criteria) this;
        }

        public Criteria andAccmonIsNotNull() {
            addCriterion("accmon is not null");
            return (Criteria) this;
        }

        public Criteria andAccmonEqualTo(String value) {
            addCriterion("accmon =", value, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonNotEqualTo(String value) {
            addCriterion("accmon <>", value, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonGreaterThan(String value) {
            addCriterion("accmon >", value, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonGreaterThanOrEqualTo(String value) {
            addCriterion("accmon >=", value, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonLessThan(String value) {
            addCriterion("accmon <", value, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonLessThanOrEqualTo(String value) {
            addCriterion("accmon <=", value, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonLike(String value) {
            addCriterion("accmon like", value, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonNotLike(String value) {
            addCriterion("accmon not like", value, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonIn(List<String> values) {
            addCriterion("accmon in", values, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonNotIn(List<String> values) {
            addCriterion("accmon not in", values, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonBetween(String value1, String value2) {
            addCriterion("accmon between", value1, value2, "accmon");
            return (Criteria) this;
        }

        public Criteria andAccmonNotBetween(String value1, String value2) {
            addCriterion("accmon not between", value1, value2, "accmon");
            return (Criteria) this;
        }

        public Criteria andTravelmodeIsNull() {
            addCriterion("travelmode is null");
            return (Criteria) this;
        }

        public Criteria andTravelmodeIsNotNull() {
            addCriterion("travelmode is not null");
            return (Criteria) this;
        }

        public Criteria andTravelmodeEqualTo(String value) {
            addCriterion("travelmode =", value, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeNotEqualTo(String value) {
            addCriterion("travelmode <>", value, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeGreaterThan(String value) {
            addCriterion("travelmode >", value, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeGreaterThanOrEqualTo(String value) {
            addCriterion("travelmode >=", value, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeLessThan(String value) {
            addCriterion("travelmode <", value, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeLessThanOrEqualTo(String value) {
            addCriterion("travelmode <=", value, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeLike(String value) {
            addCriterion("travelmode like", value, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeNotLike(String value) {
            addCriterion("travelmode not like", value, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeIn(List<String> values) {
            addCriterion("travelmode in", values, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeNotIn(List<String> values) {
            addCriterion("travelmode not in", values, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeBetween(String value1, String value2) {
            addCriterion("travelmode between", value1, value2, "travelmode");
            return (Criteria) this;
        }

        public Criteria andTravelmodeNotBetween(String value1, String value2) {
            addCriterion("travelmode not between", value1, value2, "travelmode");
            return (Criteria) this;
        }

        public Criteria andArrivalairportIsNull() {
            addCriterion("arrivalairport is null");
            return (Criteria) this;
        }

        public Criteria andArrivalairportIsNotNull() {
            addCriterion("arrivalairport is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalairportEqualTo(String value) {
            addCriterion("arrivalairport =", value, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportNotEqualTo(String value) {
            addCriterion("arrivalairport <>", value, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportGreaterThan(String value) {
            addCriterion("arrivalairport >", value, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportGreaterThanOrEqualTo(String value) {
            addCriterion("arrivalairport >=", value, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportLessThan(String value) {
            addCriterion("arrivalairport <", value, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportLessThanOrEqualTo(String value) {
            addCriterion("arrivalairport <=", value, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportLike(String value) {
            addCriterion("arrivalairport like", value, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportNotLike(String value) {
            addCriterion("arrivalairport not like", value, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportIn(List<String> values) {
            addCriterion("arrivalairport in", values, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportNotIn(List<String> values) {
            addCriterion("arrivalairport not in", values, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportBetween(String value1, String value2) {
            addCriterion("arrivalairport between", value1, value2, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairportNotBetween(String value1, String value2) {
            addCriterion("arrivalairport not between", value1, value2, "arrivalairport");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineIsNull() {
            addCriterion("arrivalairline is null");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineIsNotNull() {
            addCriterion("arrivalairline is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineEqualTo(String value) {
            addCriterion("arrivalairline =", value, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineNotEqualTo(String value) {
            addCriterion("arrivalairline <>", value, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineGreaterThan(String value) {
            addCriterion("arrivalairline >", value, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineGreaterThanOrEqualTo(String value) {
            addCriterion("arrivalairline >=", value, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineLessThan(String value) {
            addCriterion("arrivalairline <", value, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineLessThanOrEqualTo(String value) {
            addCriterion("arrivalairline <=", value, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineLike(String value) {
            addCriterion("arrivalairline like", value, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineNotLike(String value) {
            addCriterion("arrivalairline not like", value, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineIn(List<String> values) {
            addCriterion("arrivalairline in", values, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineNotIn(List<String> values) {
            addCriterion("arrivalairline not in", values, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineBetween(String value1, String value2) {
            addCriterion("arrivalairline between", value1, value2, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivalairlineNotBetween(String value1, String value2) {
            addCriterion("arrivalairline not between", value1, value2, "arrivalairline");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeIsNull() {
            addCriterion("arrivaldatetime is null");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeIsNotNull() {
            addCriterion("arrivaldatetime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeEqualTo(String value) {
            addCriterion("arrivaldatetime =", value, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeNotEqualTo(String value) {
            addCriterion("arrivaldatetime <>", value, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeGreaterThan(String value) {
            addCriterion("arrivaldatetime >", value, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrivaldatetime >=", value, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeLessThan(String value) {
            addCriterion("arrivaldatetime <", value, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeLessThanOrEqualTo(String value) {
            addCriterion("arrivaldatetime <=", value, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeLike(String value) {
            addCriterion("arrivaldatetime like", value, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeNotLike(String value) {
            addCriterion("arrivaldatetime not like", value, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeIn(List<String> values) {
            addCriterion("arrivaldatetime in", values, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeNotIn(List<String> values) {
            addCriterion("arrivaldatetime not in", values, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeBetween(String value1, String value2) {
            addCriterion("arrivaldatetime between", value1, value2, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldatetimeNotBetween(String value1, String value2) {
            addCriterion("arrivaldatetime not between", value1, value2, "arrivaldatetime");
            return (Criteria) this;
        }

        public Criteria andArrivaldateIsNull() {
            addCriterion("arrivaldate is null");
            return (Criteria) this;
        }

        public Criteria andArrivaldateIsNotNull() {
            addCriterion("arrivaldate is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaldateEqualTo(Date value) {
            addCriterionForJDBCDate("arrivaldate =", value, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("arrivaldate <>", value, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateGreaterThan(Date value) {
            addCriterionForJDBCDate("arrivaldate >", value, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrivaldate >=", value, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateLessThan(Date value) {
            addCriterionForJDBCDate("arrivaldate <", value, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrivaldate <=", value, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateIn(List<Date> values) {
            addCriterionForJDBCDate("arrivaldate in", values, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("arrivaldate not in", values, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrivaldate between", value1, value2, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrivaldate not between", value1, value2, "arrivaldate");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNull() {
            addCriterion("arrivaltime is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNotNull() {
            addCriterion("arrivaltime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeEqualTo(Date value) {
            addCriterionForJDBCTime("arrivaltime =", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("arrivaltime <>", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThan(Date value) {
            addCriterionForJDBCTime("arrivaltime >", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("arrivaltime >=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThan(Date value) {
            addCriterionForJDBCTime("arrivaltime <", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("arrivaltime <=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIn(List<Date> values) {
            addCriterionForJDBCTime("arrivaltime in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("arrivaltime not in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("arrivaltime between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("arrivaltime not between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andDepartureairportIsNull() {
            addCriterion("departureairport is null");
            return (Criteria) this;
        }

        public Criteria andDepartureairportIsNotNull() {
            addCriterion("departureairport is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureairportEqualTo(String value) {
            addCriterion("departureairport =", value, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportNotEqualTo(String value) {
            addCriterion("departureairport <>", value, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportGreaterThan(String value) {
            addCriterion("departureairport >", value, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportGreaterThanOrEqualTo(String value) {
            addCriterion("departureairport >=", value, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportLessThan(String value) {
            addCriterion("departureairport <", value, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportLessThanOrEqualTo(String value) {
            addCriterion("departureairport <=", value, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportLike(String value) {
            addCriterion("departureairport like", value, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportNotLike(String value) {
            addCriterion("departureairport not like", value, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportIn(List<String> values) {
            addCriterion("departureairport in", values, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportNotIn(List<String> values) {
            addCriterion("departureairport not in", values, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportBetween(String value1, String value2) {
            addCriterion("departureairport between", value1, value2, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairportNotBetween(String value1, String value2) {
            addCriterion("departureairport not between", value1, value2, "departureairport");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineIsNull() {
            addCriterion("departureairline is null");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineIsNotNull() {
            addCriterion("departureairline is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineEqualTo(String value) {
            addCriterion("departureairline =", value, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineNotEqualTo(String value) {
            addCriterion("departureairline <>", value, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineGreaterThan(String value) {
            addCriterion("departureairline >", value, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineGreaterThanOrEqualTo(String value) {
            addCriterion("departureairline >=", value, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineLessThan(String value) {
            addCriterion("departureairline <", value, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineLessThanOrEqualTo(String value) {
            addCriterion("departureairline <=", value, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineLike(String value) {
            addCriterion("departureairline like", value, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineNotLike(String value) {
            addCriterion("departureairline not like", value, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineIn(List<String> values) {
            addCriterion("departureairline in", values, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineNotIn(List<String> values) {
            addCriterion("departureairline not in", values, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineBetween(String value1, String value2) {
            addCriterion("departureairline between", value1, value2, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDepartureairlineNotBetween(String value1, String value2) {
            addCriterion("departureairline not between", value1, value2, "departureairline");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeIsNull() {
            addCriterion("departuredatetime is null");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeIsNotNull() {
            addCriterion("departuredatetime is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeEqualTo(String value) {
            addCriterion("departuredatetime =", value, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeNotEqualTo(String value) {
            addCriterion("departuredatetime <>", value, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeGreaterThan(String value) {
            addCriterion("departuredatetime >", value, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("departuredatetime >=", value, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeLessThan(String value) {
            addCriterion("departuredatetime <", value, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeLessThanOrEqualTo(String value) {
            addCriterion("departuredatetime <=", value, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeLike(String value) {
            addCriterion("departuredatetime like", value, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeNotLike(String value) {
            addCriterion("departuredatetime not like", value, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeIn(List<String> values) {
            addCriterion("departuredatetime in", values, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeNotIn(List<String> values) {
            addCriterion("departuredatetime not in", values, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeBetween(String value1, String value2) {
            addCriterion("departuredatetime between", value1, value2, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedatetimeNotBetween(String value1, String value2) {
            addCriterion("departuredatetime not between", value1, value2, "departuredatetime");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIsNull() {
            addCriterion("departuredate is null");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIsNotNull() {
            addCriterion("departuredate is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturedateEqualTo(Date value) {
            addCriterionForJDBCDate("departuredate =", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("departuredate <>", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateGreaterThan(Date value) {
            addCriterionForJDBCDate("departuredate >", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("departuredate >=", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateLessThan(Date value) {
            addCriterionForJDBCDate("departuredate <", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("departuredate <=", value, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateIn(List<Date> values) {
            addCriterionForJDBCDate("departuredate in", values, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("departuredate not in", values, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("departuredate between", value1, value2, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("departuredate not between", value1, value2, "departuredate");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIsNull() {
            addCriterion("departuretime is null");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIsNotNull() {
            addCriterion("departuretime is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeEqualTo(Date value) {
            addCriterionForJDBCTime("departuretime =", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("departuretime <>", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("departuretime >", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("departuretime >=", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeLessThan(Date value) {
            addCriterionForJDBCTime("departuretime <", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("departuretime <=", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIn(List<Date> values) {
            addCriterionForJDBCTime("departuretime in", values, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("departuretime not in", values, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("departuretime between", value1, value2, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("departuretime not between", value1, value2, "departuretime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeIsNull() {
            addCriterion("registrationdatetime is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeIsNotNull() {
            addCriterion("registrationdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeEqualTo(Date value) {
            addCriterion("registrationdatetime =", value, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeNotEqualTo(Date value) {
            addCriterion("registrationdatetime <>", value, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeGreaterThan(Date value) {
            addCriterion("registrationdatetime >", value, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registrationdatetime >=", value, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeLessThan(Date value) {
            addCriterion("registrationdatetime <", value, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("registrationdatetime <=", value, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeIn(List<Date> values) {
            addCriterion("registrationdatetime in", values, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeNotIn(List<Date> values) {
            addCriterion("registrationdatetime not in", values, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeBetween(Date value1, Date value2) {
            addCriterion("registrationdatetime between", value1, value2, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andRegistrationdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("registrationdatetime not between", value1, value2, "registrationdatetime");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedIsNull() {
            addCriterion("bhaktichakracollected is null");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedIsNotNull() {
            addCriterion("bhaktichakracollected is not null");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedEqualTo(Boolean value) {
            addCriterion("bhaktichakracollected =", value, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedNotEqualTo(Boolean value) {
            addCriterion("bhaktichakracollected <>", value, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedGreaterThan(Boolean value) {
            addCriterion("bhaktichakracollected >", value, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bhaktichakracollected >=", value, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedLessThan(Boolean value) {
            addCriterion("bhaktichakracollected <", value, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedLessThanOrEqualTo(Boolean value) {
            addCriterion("bhaktichakracollected <=", value, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedIn(List<Boolean> values) {
            addCriterion("bhaktichakracollected in", values, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedNotIn(List<Boolean> values) {
            addCriterion("bhaktichakracollected not in", values, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedBetween(Boolean value1, Boolean value2) {
            addCriterion("bhaktichakracollected between", value1, value2, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andBhaktichakracollectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bhaktichakracollected not between", value1, value2, "bhaktichakracollected");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeIsNull() {
            addCriterion("accomodationType is null");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeIsNotNull() {
            addCriterion("accomodationType is not null");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeEqualTo(String value) {
            addCriterion("accomodationType =", value, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeNotEqualTo(String value) {
            addCriterion("accomodationType <>", value, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeGreaterThan(String value) {
            addCriterion("accomodationType >", value, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("accomodationType >=", value, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeLessThan(String value) {
            addCriterion("accomodationType <", value, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeLessThanOrEqualTo(String value) {
            addCriterion("accomodationType <=", value, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeLike(String value) {
            addCriterion("accomodationType like", value, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeNotLike(String value) {
            addCriterion("accomodationType not like", value, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeIn(List<String> values) {
            addCriterion("accomodationType in", values, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeNotIn(List<String> values) {
            addCriterion("accomodationType not in", values, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeBetween(String value1, String value2) {
            addCriterion("accomodationType between", value1, value2, "accomodationType");
            return (Criteria) this;
        }

        public Criteria andAccomodationTypeNotBetween(String value1, String value2) {
            addCriterion("accomodationType not between", value1, value2, "accomodationType");
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