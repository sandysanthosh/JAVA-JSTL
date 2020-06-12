# JAVA-JSTL

#### JSTL (JSP Standard Tag Library)

The JavaServer Pages Standard Tag Library (JSTL) is a collection of useful JSP tags which encapsulates the core functionality common to many JSP applications.

JSTL has support for common, structural tasks such as iteration and conditionals, tags for manipulating XML documents, internationalization tags, and SQL tags. It also provides a framework for integrating the existing custom tags with the JSTL tags


#### pom.xml:

    <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>jstl</artifactId>
          <version>1.2</version>
        </dependency>
        
        

 #### JSTL tags:

1->add this:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  



#### core tags:

            catch tags: catches any throwable to occurs
            choose tags: conditional tags
            if tags: simple if/then conditional
            import tags: retrieves a URL
            forEach: collections of value
            forTokens: collections of token
            out : displaying output
            otherwise: <choose>
            param: add param URL
            redirect: new URL
            remove: remove scoped variables
            set: assigns an expression
            url: define a URL
            when: <choose> tag

#### for each:

    <%
    string[] citites={"mumbai","singapore"};
    pageContext.setAttribute("mycities",citites);
    %>

#### JSTL(for-each):

    <body>
    <c:forEach var="tempcity" items="${mycities}">
    ${tempcity} <br/>
    </c:forEach>
    </body>


#### pojo class:

 ####student.java:

        private String firstName;
        private String lastname;
        private String goldCusotmer;
        getter & setters
        constructor using fields

#### new jsp:

        <%
        List<Student> data=new ArrayList<>();
        data.add(new Student("john","Doe",false);
        data.add(new Student("ram","Johnson",false);
        data.add(new Student("sandy","doe",true);
        pageContext.setAttribute("mystudent",data);
        %>

        <body>
        <c:forEach var="tempStudent" items="${mystudent}">
        ${tempStudent.firstname},
        ${tempStudent.lastname},
        ${tempStudent.goldCusotmer}
        <br/>
        </c:forEach>

#### will display the pojo class value in JSP page.

        <c:if test="${tempStudent.goldSutomer}">
        special discount
        </c:if>

        <c:if test="${not tempStudent.goldSutomer}">
        no discount
        </c:if>

#### switch statment JSTL:

#### using choose:

            <c:choose>
            <c:when test="${tempStudent.goldSutomer}">
            special discount
            </c:when>

            <c:otherwise>
            no soup for you!
            </c:otherwise>

            </c:choose>



#### functional tags:

collections length:legth

string manipulation:

        toUpperCase,toLowerCase
        subString,subStringAfter,substringBefore
        trim,replace,indexOf,startsWith,endsWith
        contains,containsIgnoreCase,split,join,escapexml

#### length:

            <c:set var="data" value="luv2code"/>
            Length of the String <b>${data}</b> ${fn:length(data)}

            ${fn:length(data)}
            ${fn:toUpperCase(data)}
            ${fn:startsWith(data,"luv")}

            split and join:
            fn:split()


