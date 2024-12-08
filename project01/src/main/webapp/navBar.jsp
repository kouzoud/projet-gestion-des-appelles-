<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive NavBar</title>
    <style>
        /* General Reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* NavBar Styles */
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #333;
            padding: 10px 20px;
            color: white;
        }

        .navbar .logo {
            font-size: 24px;
            font-weight: bold;
            color: white;
            text-decoration: none;
        }

        .navbar .hamburger {
            display: none;
            font-size: 24px;
            background: none;
            border: none;
            color: white;
            cursor: pointer;
        }

        .navbar-links {
            list-style: none;
            display: flex;
            gap: 20px;
        }

        .navbar-links li {
            position: relative;
        }

        .navbar-links a {
            text-decoration: none;
            color: white;
            padding: 5px 10px;
            transition: 0.3s;
        }

        .navbar-links a:hover {
            background-color: #555;
            border-radius: 4px;
        }

        /* Dropdown Menu */
        .dropdown-menu {
            position: absolute;
            top: 100%;
            left: 0;
            display: none;
            background-color: #444;
            list-style: none;
            padding: 10px;
            margin: 0;
            border-radius: 4px;
            z-index: 10;
        }

        .dropdown:hover .dropdown-menu {
            display: block;
        }

        .dropdown-menu li {
            margin: 5px 0;
        }

        .dropdown-menu a {
            padding: 5px;
            display: block;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .navbar-links {
                display: none;
                flex-direction: column;
                background-color: #333;
                position: absolute;
                top: 60px;
                right: 0;
                width: 200px;
                padding: 10px;
                border-radius: 4px;
            }

            .navbar-links.show {
                display: flex;
            }

            .hamburger {
                display: block;
            }
        }
    </style>
</head>
<body>
<nav class="navbar">
    <div class="navbar-brand">
        <a href="#" class="logo">MyWebsite</a>
        <button class="hamburger" onclick="toggleMenu()">☰</button>
    </div>
    <ul class="navbar-links" id="navbar-links">
        <li><a href="home.jsp">Home</a></li>
        <li><a href="about.jsp">About</a></li>
        <li class="dropdown">
            <a href="news.jsp">news </a>
            <ul class="dropdown-menu">
                <li><a href="#webdev">Web Development</a></li>
                <li><a href="#design">Design</a></li>
                <li><a href="#seo">SEO</a></li>
            </ul>
        </li>
        <li><a href="index.jsp">Contact</a></li>
    </ul>
</nav>

<script>
    function toggleMenu() {
        const navbarLinks = document.getElementById('navbar-links');
        navbarLinks.classList.toggle('show');
    }
</script>
</body>
</html>
