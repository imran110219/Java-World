# জাভা টেম্পলেট ইঞ্জিন

জাভা টেম্পলেট ইঞ্জিন হল এমন একটা সিস্টেম যাতে জাভা ডাটা অবজেক্ট html অথবা jsp তে দেখানো যায়। টেম্পলেটের মাধ্যমে জাভা কোড এইচটিএমএল অথবা জেএসপি তে লেখা যায়। একটু সহজভাবে বলতে গেলে html/jsp তে জাভা ডাটা অবজেক্ট দেখানোর জন্য বিভিন্ন টেম্পলেটের সিনট্যাক্স আছে যার দ্বারা আমরা ডাইনামিকভাবে ভ্যালু দেখতে পারি।                
বিভিন্ন ধরনের জাভা টেম্পলেট ইঞ্জিন আছে। যেমনঃ       
১. Java Server Pages with the Java Server Pages Tag Library (JSP/JSTL)                  
২. Thymeleaf                
৩. FreeMarker                  

<img src="Images/Template Engine.png" />

**JSP and JSTL**                                   
The Cognito demonstration application was developed to explore the AWS Cognito authentication service. The application includes ten web pages, where almost every page includes dynamic server side data.

The original version of the Cognito demonstration application uses JSP and JSTL templates in the web pages.

JSTL supports the <c:import … > tag which allows HTML fragements to be included in the page or page header.

The example below shows how conditional logic can be added for server side page generation. When a page is sent to the client, it will consists of static HTML, which has been dynamically generated on the server.




https://hackernoon.com/java-template-engines-ef84cb1025a4