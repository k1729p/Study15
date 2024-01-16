<!DOCTYPE html>
<HTML lang="en">
<META charset="UTF-8">
<BODY>
<a href="https://github.com/k1729p/Study15/tree/main/docs"><img alt="" src="images/ColorScheme.png" height="25" width="800"/></a>
<H2 id="contents">Study15 README Contents</H2>
<h3 id="top">Research <a href="https://solr.apache.org/guide/solr/latest/index.html">Solr</a></h3>

<p><img alt="" src="images/MermaidFlowchart.png" height="190" width="500"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>The flowchart with Solr.</i></p>

<p>
The sections of this project:
</p>
<ol>
<li><a href="#ONE">Launch Solr</A></li>
<li><a href="#TWO">Web Browser Solr Queries</A></li>
<li><a href="#THREE">Curl Solr Queries</A></li>
</ol>

<p>Java source code:<br>
<img alt="" src="images/aquaHR-500.png"><br>
<img alt="" src="images/aquaSquare.png"> <a href="https://github.com/k1729p/Study15/tree/main/src/main/java/kp">kp</a><br>
<img alt="" src="images/aquaHR-500.png"></p>

<p>
<img alt="" src="images/yellowHR-500.png"><br>
<img alt="" src="images/yellowSquare.png">
    <a href="http://htmlpreview.github.io/?https://github.com/k1729p/Study15/blob/main/docs/apidocs/overview-tree.html">
	Java API Documentation</a><br>
<img alt="" src="images/yellowHR-500.png">
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<H2 id="ONE">❶ Launch Solr</H2>

<p>Action:<br>
<img alt="" src="images/orangeHR-500.png"><br>
<img alt="" src="images/orangeSquare.png"> 1. With the batch file 
<a href="https://github.com/k1729p/Study15/blob/main/0_batch/01%20MVN%20clean%20install%20run.bat"> 
<i>"01 MVN clean install run.bat"</i></a> start the 
<a href="https://github.com/k1729p/Study15/blob/main/src/main/java/kp/Application.java">'Application'</a>.<br>
<img alt="" src="images/orangeSquare.png"> 2. With the batch file 
<a href="https://github.com/k1729p/Study15/blob/main/0_batch/02%20Start%20Solr.bat"> 
<i>"02 Start Solr.bat"</i></a> start the Solr.<br>
<img alt="" src="images/orangeSquare.png"> 3. With the batch file 
<a href="https://github.com/k1729p/Study15/blob/main/0_batch/03%20CURL%20recreate%20collection.bat"> 
<i>"03 CURL recreate collection.bat"</i></a> recreate the collection.<br>
<img alt="" src="images/orangeHR-500.png"></p>

<p><img alt="" src="images/greenCircle.png"> 
1.1. The <a href="https://github.com/k1729p/Study15/blob/main/src/main/java/kp/Application.java">'Application'</a> 
creates in the directory <a href="https://github.com/k1729p/Study15/tree/main/solr-requests">'solr-requests'</a> 
the big file <a href="https://github.com/k1729p/Study15/blob/main/solr-requests/dataset.json">'<b>dataset.json</b>'</a> (about 800 KB). 
</p>
<p>
The selected files from <a href="#PROJECTS">'<b>Projects</b>'</a> are read in the method 
<a href="https://github.com/k1729p/Study15/blob/main/src/main/java/kp/KeywordsCollector.java#L153">'KeywordsCollector::readFile'</a>.
</p>
<p>
The files are filtered with the <a href="#KEYWORDS">'<b>Keywords</b>'</a>.
<p>

<p><img alt="" src="images/greenCircle.png"> 
1.2. The <a href="images/ScreenshotCurlCreateCollection.png">screenshot</a> of the console log for the batch file 
<a href="https://github.com/k1729p/Study15/blob/main/0_batch/03%20CURL%20recreate%20collection.bat">
<i>"03 CURL recreate collection.bat"</i></a>.<br>
The collection is created with the file 
<a href="https://github.com/k1729p/Study15/blob/main/solr-requests/create-collection.json">'create-collection.json'</a>.<br>
The schema is created with the file 
<a href="https://github.com/k1729p/Study15/blob/main/solr-requests/create-schema.json">'create-schema.json'</a>.<br>
The Solr index update adds multiple JSON documents from the '<b>dataset.json</b>' file.<br>
</p>

<p><img alt="" src="images/greenCircle.png"> 
1.3. The <a href="images/SolrAdminCollections.png">screenshot</a> of the 'kp_study' collection showed in the 
<a href="http://localhost:8983/solr/#/">'Solr Administrator Console'</a>.

<a href="#top">Back to the top of the page</a>
<hr>
<H2 id="TWO">❷ Web Browser Solr Queries</H2>
<p>
<img alt="" src="images/orangeHR-500.png"><br>
<img alt="" src="images/orangeSquare.png"> 1. Run in the web browser the file '0_batch/Links.html'.<br>
<img alt="" src="images/orangeHR-500.png">
</p>

<p>
The page '<b>Links</b>': 
<a href="https://github.com/k1729p/Study15/blob/main/0_batch/Links.html">HTML code</a>, 
<a href="http://htmlpreview.github.io/?https://github.com/k1729p/Study15/blob/main/0_batch/Links.html">HTML preview</a>
</p>
<p>
<img alt="" src="images/ScreenshotLinksPage.png" height="385" width="1285"/><br>
<img alt="" src="images/blackArrowUp.png">
<i>The screenshot of the page 'Links'.</i>
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.1.1. The links group '<b>Spring Keywords</b>', the query '@springbootapplication'.<br>
The query results <a href="images/SpringKeywordsAtSpringbootapplication.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.1.2. The links group '<b>Spring Keywords</b>', the query '@getmapping'.<br>
The query results <a href="images/SpringKeywordsAtGetmapping.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.2.1. The links group '<b>Test Keywords</b>', the query '@test'.<br>
The query results <a href="images/TestKeywordsAtTest.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.2.2. The links group '<b>Test Keywords</b>', the query '@springboottest'.<br>
The query results <a href="images/TestKeywordsAtSpringboottest.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.2.3. The links group '<b>Test Keywords</b>', the query '@webmvctest'.<br>
The query results <a href="images/TestKeywordsAtWebmvctest.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.2.4. The links group '<b>Test Keywords</b>', the query 'testresttemplate'.<br>
The query results <a href="images/TestKeywordsAtTestresttemplate.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.3.1. The links group '<b>Other Annotation Keywords</b>', the query '@entity'.<br>
The query results <a href="images/OtherAnnotationKeywordsAtEntity.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.3.2. The links group '<b>Other Annotation Keywords</b>', the query '@transactional'.<br>
The query results <a href="images/OtherAnnotationKeywordsAtTransactional.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.3.3. The links group '<b>Other Annotation Keywords</b>', the query '@ejb'.<br>
The query results <a href="images/OtherAnnotationKeywordsAtEjb.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.3.4. The links group '<b>Other Annotation Keywords</b>', the query '@document'.<br>
The query results <a href="images/OtherAnnotationKeywordsAtDocument.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.4.1. The links group '<b>SQL Queries</b>', the query "COUNT '@getmapping' OR '@postmapping'".<br>
The SQL query:<br>
<code>SELECT DISTINCT project, keyword, COUNT(*) records
FROM kp_study
WHERE `file-extension` = 'java' AND keyword IN('@getmapping','@postmapping')
GROUP BY project, keyword ORDER BY project, keyword</code>
</p>
<p>
The query results <a href="images/SQLQueriesAtGetmapping.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.4.2. The links group '<b>SQL Queries</b>', the query "COUNT '@WebMvcTest' OR 'TestRestTemplate'".<br>
The SQL query:<br>
<code>SELECT DISTINCT project, keyword, COUNT(*) records 
FROM kp_study
WHERE `file-extension` = 'java' AND keyword IN('@webmvctest','testresttemplate')
GROUP BY project, keyword ORDER BY project, keyword</code>
</p>
<p>
The query results <a href="images/SQLQueriesAtWebMvcTest.png">screenshot</a>.
<p>

<p><img alt="" src="images/greenCircle.png"> 
2.4.3. The links group '<b>SQL Queries</b>', the query "COUNT 'file-name', COUNT 'keyword'".<br>
The SQL query:<br>
<code>SELECT project, COUNT(DISTINCT `file-name`) file_name_cnt, COUNT(DISTINCT keyword) keyword_cnt
FROM kp_study
WHERE `file-extension` = 'java'
GROUP BY project ORDER BY project</code>
</p>
<p>
The query results <a href="images/SQLQueriesFileName.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.4.4. The links group '<b>SQL Queries</b>', the query "keyword LIKE 'mock%'".<br>
The SQL query:<br>
<code>SELECT DISTINCT project, `file-name`, keyword
FROM kp_study
WHERE `file-extension` = 'java' AND keyword LIKE 'mock%25'</code>
</p>
<p>
The query results <a href="images/SQLQueriesLikeMock.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.5.1. The links group '<b>Keywords Faceting</b>', the query 'top 5 keywords'.<br>
The query results <a href="images/KeywordsFacetingTop5.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.5.2. The links group '<b>Keywords Faceting</b>', the query 'all keywords'.<br>
The query results <a href="images/KeywordsFacetingAll.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.5.3. The links group '<b>Keywords Faceting</b>', the query 'pivot [ project / file-name / keyword ]'.<br>
The query results <a href="images/KeywordsFacetingPivot.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.6.1. The links group '<b>Other Keywords</b>', the query "'reactive' (not in project 'Miscellany')".<br>
The query results <a href="images/OtherKeywordsReactive.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.6.2. The links group '<b>Other Keywords</b>', the query "'comparable' (full response)".<br>
The query results <a href="images/OtherKeywordsComparable.png">screenshot</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
2.7.1. The SQL query runs in the <b>Solr console</b> 
<a href="http://localhost:8983/solr/#/kp_study/sqlquery">'http://localhost:8983/solr/#/kp_study/sqlquery'</a>.<br>
The SQL query:<br>
<code>SELECT
project Project_Name, COUNT(DISTINCT `file-name`) File_Name_Count, COUNT(DISTINCT keyword) Keyword_Count
FROM kp_study
WHERE `file-extension` = 'java' 
GROUP BY project
ORDER BY project</code>
</p>
<p>
The <a href="images/SolrSqlQuery.png">screenshot</a> of the <b>Solr console</b> with the query results.
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<H2 id="THREE">❸ Curl Solr Queries</H2>

<p>Action:<br>
<img alt="" src="images/orangeHR-500.png"><br>
<img alt="" src="images/orangeSquare.png"> 1. With the batch file 
<a href="https://github.com/k1729p/Study15/blob/main/0_batch/04%20CURL%20query.bat"> 
<i>"04 CURL query.bat"</i></a> send queries to Solr.<br>
<img alt="" src="images/orangeHR-500.png"></p>

<p><img alt="" src="images/greenCircle.png"> 
3.1. The <a href="images/ScreenshotCurlQuery.png">screenshot</a> with the Curl query results.
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<H2 id="PROJECTS">Projects</H2>
<table style="border:solid">
<tbody>
<tr>
<td style="border:solid">Miscellany</td>
<td style="border:solid">&nbsp;</td>
<td style="border:solid">&nbsp;</td>
<td style="border:solid">&nbsp;</td>
<td style="border:solid">&nbsp;</td>
</tr><tr>
<td style="border:solid">Study01</td>
<td style="border:solid">Study02</td>
<td style="border:solid">Study03</td>
<td style="border:solid">Study04</td>
<td style="border:solid">Study05</td>
</tr><tr>
<td style="border:solid">Study06</td>
<td style="border:solid">Study07</td>
<td style="border:solid">Study08</td>
<td style="border:solid">Study09</td>
<td style="border:solid">Study10</td>
</tr><tr>
<td style="border:solid">Study11</td>
<td style="border:solid">Study12</td>
<td style="border:solid">Study13</td>
<td style="border:solid">Study14</td>
<td style="border:solid">&nbsp;</td>
</tr><tr>
<td style="border:solid">&nbsp;</td>
<td style="border:solid">Study17</td>
<td style="border:solid">Study18</td>
<td style="border:solid">Study19</td>
<td style="border:solid">Study20</td>
</tr>
</tbody></table>
<hr>
<H2 id="KEYWORDS">Keywords</H2>
<table style="border:solid">
<tbody>
<tr>
<td style="border:solid">@component</td>
<td style="border:solid">@controller</td>
<td style="border:solid">@document</td>
<td style="border:solid">@ejb</td>
<td style="border:solid">@entity</td>
<td style="border:solid">@getmapping</td>
<td style="border:solid">@inject</td>
<td style="border:solid">@messagedriven</td>
</tr><tr>
<td style="border:solid">@mockbean</td>
<td style="border:solid">@namedquery</td>
<td style="border:solid">@postmapping</td>
<td style="border:solid">@restcontroller</td>
<td style="border:solid">@springbootapplication</td>
<td style="border:solid">@springboottest</td>
<td style="border:solid">@stateless</td>
<td style="border:solid">@test</td>
</tr><tr>
<td style="border:solid">@transactional</td>
<td style="border:solid">@webmvctest</td>
<td style="border:solid">activemq</td>
<td style="border:solid">angularjs</td>
<td style="border:solid">asynchronous</td>
<td style="border:solid">bayes</td>
<td style="border:solid">camunda</td>
<td style="border:solid">cdi</td>
</tr><tr>
<td style="border:solid">checksum</td>
<td style="border:solid">circuitbreaker</td>
<td style="border:solid">collator</td>
<td style="border:solid">comparable</td>
<td style="border:solid">comparator</td>
<td style="border:solid">completablefuture</td>
<td style="border:solid">credentials</td>
<td style="border:solid">criteriaquery</td>
</tr><tr>
<td style="border:solid">cryptography</td>
<td style="border:solid">curl</td>
<td style="border:solid">cyclicbarrier</td>
<td style="border:solid">database</td>
<td style="border:solid">decrypt</td>
<td style="border:solid">docker</td>
<td style="border:solid">ellipticcurvecryptography</td>
<td style="border:solid">encrypt</td>
</tr><tr>
<td style="border:solid">entitymanager</td>
<td style="border:solid">entitymodel</td>
<td style="border:solid">flux</td>
<td style="border:solid">hateoas</td>
<td style="border:solid">jaxb</td>
<td style="border:solid">jboss</td>
<td style="border:solid">jpa</td>
<td style="border:solid">jquery</td>
</tr><tr>
<td style="border:solid">jsf</td>
<td style="border:solid">kafka</td>
<td style="border:solid">mapstruct</td>
<td style="border:solid">mockito</td>
<td style="border:solid">mockmvc</td>
<td style="border:solid">mongodb</td>
<td style="border:solid">mono</td>
<td style="border:solid">openapi</td>
</tr><tr>
<td style="border:solid">orchestration</td>
<td style="border:solid">patriciatrie</td>
<td style="border:solid">postgresql</td>
<td style="border:solid">reactive</td>
<td style="border:solid">reactivemongorepository</td>
<td style="border:solid">redis</td>
<td style="border:solid">restful</td>
<td style="border:solid">resttemplate</td>
</tr><tr>
<td style="border:solid">securerandom</td>
<td style="border:solid">soap</td>
<td style="border:solid">sonar</td>
<td style="border:solid">sonarqube</td>
<td style="border:solid">spotlight</td>
<td style="border:solid">spring</td>
<td style="border:solid">sslsocket</td>
<td style="border:solid">swagger</td>
</tr><tr>
<td style="border:solid">teeing</td>
<td style="border:solid">testresttemplate</td>
<td style="border:solid">thymeleaf</td>
<td style="border:solid">webclient</td>
<td style="border:solid">webflux</td>
<td style="border:solid">weld</td>
<td style="border:solid">wildfly</td>
<td style="border:solid">zoneddatetime</td>
</tr>
</tbody></table>

<a href="#top">Back to the top of the page</a>
<hr>
</BODY>
</HTML>