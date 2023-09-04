<div id="readme-top" align="center">

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
</div>
<br>
<br>

<h2 align="center">  Stackoverflow➕➕</h2>
<br>
  <p align="center">
     A question-and-answer website
    <br>
    <br>
    <a href="https://github.com/felhos/stackoverflow-plus-plus"><strong>Explore the docs :arrow_right:	</strong></a>
    <br />
    <br />
    <a href="https://docs.google.com/presentation/d/1Dr0tgvGw4TmGDj0qH0hwrLUi4fb8a6SQ6HPecOnY4RY/edit#slide=id.p">View Presentation of the project :clapper:	</a>
  </p>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
<div id="about-the-project"></div>

## About The Project :page_with_curl:

<br />
Stackoverflow++ is a question-and-answer website where users can register, login,
ask questions or answer questions, sort questions and search for questions.
<br />
<br />

<br />
<p align="right">(<a href="#readme-top">back to top</a>)</p>


<div id="built-with"></div>

### Built With :wrench:

* [![Java][Java.img]][Java-url]
* [![Spring][Spring.img]][Spring-url]
* [![JavaScript][JavaScript.img]][JavaScript-url]
* [![React][React.img]][React-url]
* [![PostgreSQL][PostgreSQL.img]][PostgreSQL-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
<div id="getting-started"></div>

## Getting Started :arrow_forward:

<div id="prerequisites"></div>

### Prerequisites :ballot_box_with_check:

To run this project, you need to have the following:

:one: Java <br>
:two: Apache Maven  <br>
:three: IntelliJ <br>
:four: PostgreSQL <br>

<div id="installation"></div>

## Installation :floppy_disk:

### Server side

:one: Clone the repository to your local machine

```sh
   git clone https://github.com/felhos/stackoverflow-plus-plus.git
```

:two: Create a database in PostgreSQL named "stackoverflow"

:three: In the application.properties file, change these fields to your data: <br>

* spring.datasource.url=jdbc:postgresql://localhost/stackoverflow
* spring.datasource.username=_your username_<br>
* spring.datasource.password=_your password_<br>

:four: In IDE you can Run the application by the "Run" button in the top right corner or with Shift + F10 shortcut in
IntelliJ IDEA

### Client side

#### Install dependencies

```bash
cd ./frontend
npm install
```

#### Running the code

```bash
cd ./frontend
npm start
```

And the create-react-app react-scripts package will start your frontend on the port 3000, and you can visit
the http://localhost:3000 on your preferred browser.


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
<div id="usage"></div>

## Usage :joystick:

This is a Q&A website. You can register to the page, after logging in there are some features
available: browsing in the posted question and answers, or uploading your new question, sort questions.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
<div id="contact"></div>

## Contact

:envelope:    **Kacsán Márton** - marckacsan@gmail.com &nbsp;&nbsp;&nbsp;&nbsp; :point_right:
&nbsp;&nbsp;&nbsp;&nbsp; [![Márton's LinkedIn][linkedin-shield]][LinkedIn - Marton]

:envelope:    **Le Marcell** - lmarci121@gmail.com &nbsp;&nbsp;&nbsp;&nbsp; :point_right:
&nbsp;&nbsp;&nbsp;&nbsp; [![Marcell's LinkedIn][linkedin-shield]][LinkedIn - Marcell]

:envelope:    **Deák Csongor** - deak.csongor1@gmail.com &nbsp;&nbsp;&nbsp;&nbsp; :point_right:
&nbsp;&nbsp;&nbsp;&nbsp; [![Csongor's LinkedIn][linkedin-shield]][LinkedIn - Csongor]

:envelope:    **Dudás Dominik** - dudasdominik3@gmail.com &nbsp;&nbsp;&nbsp;&nbsp; :point_right:
&nbsp;&nbsp;&nbsp;&nbsp; [![Dominik's LinkedIn][linkedin-shield]][LinkedIn - Dominik]


<p align="right">(<a href="#readme-top">back to top</a>)</p>






<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/felhos/stackoverflow-plus-plus?style=for-the-badge

[contributors-url]: https://github.com/felhos/stackoverflow-plus-plus/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/felhos/stackoverflow-plus-plus?style=for-the-badge

[forks-url]: https://github.com/felhos/stackoverflow-plus-plus/forks

[stars-shield]: https://img.shields.io/github/stars/felhos/stackoverflow-plus-plus?style=for-the-badge

[stars-url]: https://github.com/felhos/stackoverflow-plus-plus/stargazers

[issues-shield]: https://img.shields.io/github/issues/felhos/stackoverflow-plus-plus?style=for-the-badge

[issues-url]: https://github.com/felhos/stackoverflow-plus-plus/issues

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555

[linkedin-url]: https://linkedin.com/in/linkedin_username

[LinkedIn - Marcell]: https://www.linkedin.com/in/marcell-le-355822141/

[LinkedIn - Marton]: https://www.linkedin.com/in/marton-kacsan/

[LinkedIn - Csongor]: https://www.linkedin.com/in/csongor-deak/

[LinkedIn - Dominik]: https://www.linkedin.com/in/dominik-dudas/

[JavaScript.img]: https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E

[JavaScript-url]: https://www.javascript.com/

[Spring.img]: https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white

[Spring-url]: https://spring.io/

[React.img]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB

[React-url]: https://react.dev/

[PostgreSQL.img]: https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white

[PostgreSQL-url]: https://www.postgresql.org/

[Java.img]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white

[Java-url]: https://www.java.com/en/