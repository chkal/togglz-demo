
<%@page import="org.togglz.demo.DemoFeatures"%>
<%@page import="org.togglz.core.context.FeatureContext"%>
<html>
<body>

  <p>
    Current user:
    <%=FeatureContext.getFeatureManager().getCurrentFeatureUser().getName()%>
  </p>

  <ul>
    <li><strong>FEATURE_ONE</strong>: <%=DemoFeatures.FEATURE_ONE.isActive()%></li>
    <li><strong>FEATURE_TWO</strong>: <%=DemoFeatures.FEATURE_TWO.isActive()%></li>
  </ul>

  <p>
    <a href="<%=request.getContextPath()%>/togglz/">Admin Console</a>
  </p>

</body>
</html>
