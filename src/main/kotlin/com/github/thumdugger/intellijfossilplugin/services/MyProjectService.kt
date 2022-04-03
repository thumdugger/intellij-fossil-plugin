package com.github.thumdugger.intellijfossilplugin.services

import com.intellij.openapi.project.Project
import com.github.thumdugger.intellijfossilplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
