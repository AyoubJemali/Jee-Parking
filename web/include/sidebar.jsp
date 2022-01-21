
<nav class="sidebar sidebar-offcanvas" id="sidebar">
    <div
        class="sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
        <a class="sidebar-brand brand-logo" href="index.html"><img
                src="<%=request.getContextPath()%>/template/images/logo.svg"
                alt="logo" /></a> <a class="sidebar-brand brand-logo-mini"
                             href="index.html"><img
                src="<%=request.getContextPath()%>/template/images/logo-mini.svg"
                alt="logo" /></a>
    </div>
    <ul class="nav">
        <li class="nav-item menu-items"><a class="nav-link"
                                           href="place.jsp"> <span class="menu-icon">
                    <i class="mdi mdi-playlist-play"></i>
                </span> <span class="menu-title">Place</span>
            </a></li>
        <li class="nav-item menu-items"><a class="nav-link"
                                           href="index.jsp"> <span class="menu-icon">
                    <i class="mdi mdi-table-large"></i>
                </span> <span class="menu-title">Section</span>
            </a></li>
        <li class="nav-item menu-items"><a class="nav-link"
                                           href="login.jsp"> <span class="menu-icon"> <i
                        class="mdi mdi-contacts"></i>
                </span> <span class="menu-title">Deconnecter</span>
            </a></li>
    </ul>
</nav>