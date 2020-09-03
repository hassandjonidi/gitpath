package com.github.hassandjonidi.gitpath.services

import com.intellij.openapi.project.Project
import com.github.hassandjonidi.gitpath.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
