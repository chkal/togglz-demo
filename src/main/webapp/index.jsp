
<%@page import="org.togglz.demo.DemoFeatures"%>
<%@page import="org.togglz.core.context.FeatureContext"%>
<html>
<body>

  <p>
    Current user:
    <%=FeatureContext.getFeatureManager().getCurrentFeatureUser().getName()%>
  </p>

  <ul>
    <li><strong>ADMIN_FEATURE</strong>: <%=DemoFeatures.ADMIN_FEATURE.isActive()%></li>
    <li><strong>TALKING_FEATURE</strong>: <%=DemoFeatures.TALKING_FEATURE.isActive()%></li>
  </ul>

  <p>
    <a href="<%=request.getContextPath()%>/togglz/">Admin Console</a>
  </p>

</body>
</html>
