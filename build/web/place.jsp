<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Mon template</title>
        <%@ include file="/include/css.jsp"%>
        <script src="./script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="./script/place.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container-scroller">
            <%@ include file="/include/header.jsp"%>
            <%@ include file="/include/sidebar.jsp"%>

            <div class="main-panel">
                <div class="content-wrapper">
                    <div class="page-header">
                        <h3 class="page-title"> Section </h3>
                    </div>
                    <div class="row">
                        <div class="col-md-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Id</th>
                                                    <th scope="col">Numero</th>
                                                    <th scope="col">Etat</th>
                                                    <th scope="col">Type</th>
                                                    <th scope="col">Reference </th>
                                                    <th scope="col">Liberer</th>
                                                    <th scope="col">Occuper</th>
                                                </tr>
                                            </thead>
                                            <tbody id="content">
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <%@ include file="/include/footer.jsp" %>
            </div>
        </div>
    </div>
</body>
-->
<%@ include file="/include/js.jsp"%>
</html>