<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Mon template</title>
        <%@ include file="/include/css.jsp"%>
        <script src="./script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="./script/section.js" type="text/javascript"></script>
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
                                                    <th>ID</th>
                                                    <th>Nom Section</th>
                                                    <th>Modifier</th>
                                                    <th>Supprimer<th>

                                                </tr>
                                            </thead>
                                            <tbody id="content">
                                            </tbody>
                                        </table>
                                    </div>
                                    <div><button id="h" class="btn btn-primary"> Gestion des sections</button> </div> 
                                    <div id="Gsec" class="card-body">
                                        <fieldset>
                                            <legend>Informations Section</legend>
                                            <table border="0">
                                                <tr>
                                                    <td>Code</td>
                                                    <td> 
                                                        <input id="ref" type="text" value=""  required=""/>
                                                        <button class="btn btn-success" id="add"> Ajouter </button>
                                                        <button class="btn btn-warning" id="mod"> Modifier </button>
                                                    </td>

                                                </tr>


                                            </table>
                                        </fieldset>
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