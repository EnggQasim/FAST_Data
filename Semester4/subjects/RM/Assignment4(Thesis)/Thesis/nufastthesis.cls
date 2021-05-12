% Original report class modified by Dr. Syed Muhammad Atif Saleem to fulfil the requirements of NU FAST September 2020

% nufastthesis v1.0
% By Dr. Syed Muhammad Atif Saleem <syed.saleem@nu.edu.pk>
% Version 1.0 released 2020/09/20
%-------------------------- identification ---------------------
%\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{nufastthesis}[2020/09/14 v1.0 NU FAST LaTeX Thesis class]
%-------------------------- Declaration of options -----------------------
%This class uses a report standard class
\DeclareOption*{\PassOptionsToClass{\CurrentOption}{report}}
\ProcessOptions\relax \LoadClass{report}
%
%
% DECLARATIONS
%
% These macros are used to declare arguments needed for the
% construction of the title page and other preamble.
%
% Roll Number
\def\rollno#1{\gdef\@rollno{#1}}
%
% The full (unabbreviated) name of the degree
\def\degree#1{\gdef\@degree{#1}}
% The short (abbreviated) name of the degree
\def\shortdeg#1{\gdef\@shortdeg{#1}}
% The printing date of the thesis
\def\printingdate#1{\gdef\@printingdate{#1}}
% The name of Graduate Academic Unit(eg. Electrical Engineering, Computer Science)
\def\gau#1{\gdef\@gau{#1}}
% The name of supervisor
\def\supervisor#1{\gdef\@supervisor{#1}}
% The name of internal examiner
\def\internalexam#1{\gdef\@internalexam{#1}}
% The name of external examiner 1
\def\externalexamone#1{\gdef\@externalexamone{#1}}
% The affliation of external examiner 1
\def\externalexamoneaffiliation#1{\gdef\@externalexamoneaffiliation{#1}}
% The name of external examiner 2
\def\externalexamtwo#1{\gdef\@externalexamtwo{#1}}
% The affliation of external examiner 2
\def\externalexamtwoaffiliation#1{\gdef\@externalexamtwoaffiliation{#1}}
% The name of city
\def\city#1{\gdef\@city{#1}}
%
%define title page layout
%
\newcommand{\nufasttitlepage}%
{
\thispagestyle{empty}%
\begin{center}
\vspace*{1em}
\normalfont\fontsize{24pt}{30pt}\selectfont\@title\\
\vskip 2em
\normalfont\fontsize{21pt}{25pt}\selectfont\@author\\
\vskip 1em
\normalfont\fontsize{17pt}{20pt}\selectfont\@rollno\\
\vskip 2em
\normalfont\fontsize{21pt}{25pt}\selectfont\@degree\\
\vfill
\includegraphics[width=2in]{NULogoOfficial}
\vfill
\normalfont\fontsize{17pt}{20pt}\selectfont\@gau
\vskip 1em
\normalfont\fontsize{17pt}{20pt}\selectfont National University of Computer and Emerging Sciences\\
\vskip 1em
\normalfont\fontsize{17pt}{20pt}\selectfont\@city, Pakistan\\
\vskip 1em
\normalfont\fontsize{17pt}{20pt}\selectfont\@date\\
\end{center}
}
%-----------end of Title page--------------------