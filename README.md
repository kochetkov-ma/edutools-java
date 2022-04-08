JetBrains EduTools - Java Template
---

This project provide **Quick Start Guide** and **Course Template** for `Java`

## Short description

Install the EduTools plugin: `Go to Settings/Preferences | Plugins (or Configure | Plugins from the Welcome Screen)`, 
go the Marketplace tab and search for the EduTools plugin.

#### As an Educator:
- Create your own interactive course with custom tasks, checks, tests, hints, and lots more.
- Use this template to write theory, quizzes, tasks with automatic checking and frameworks projects.
- Register on edu platform [stepik.org](https://stepik.org/) or [coursera.org](https://www.coursera.org/)
- Read this manual how to integrate with edu platform and write the best course to educate a lot of students 

## Get Started educate `[Coming Soon]...`

**`WIP ...`**

### [Coding task example with tests](Template/Task/Example%201)

### [Theory example](Template/Theory/Example)

### Resources

- [EduTools Plugin](https://plugins.jetbrains.com/plugin/10081-edutools)
- [EduTools Documentation](https://plugins.jetbrains.com/plugin/10081-edutools/docs)

## FAQ

### Edu Tools cannot upload on Stepik
It's a bug!

The `latest` work version is `2022.2-2021.2-699`. After `2022.2-2021.2-699` the bug exists.
- You should install `Idea 2021.3.3`
- Download plugin file [`2022.2-2021.2-699`](https://plugins.jetbrains.com/plugin/10081-edutools/versions/stable/160949)
- Install plugin **form disk**

### There no menu item Course Creator > Upload Course on Stepik
- Create empty course through Stepik Web App
- Get the course `ID` from URL
- Create `course-remote-info.yaml` in the root dir
```yaml
id: 115700
update_date: Thu, 07 Apr 2022 20:29:33 UTC
```
- LogIn to Stepik in Idea Settings
- Take a look at new menu item `Course Creator > Upload Course on Stepik`