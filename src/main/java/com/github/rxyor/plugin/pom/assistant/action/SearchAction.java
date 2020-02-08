package com.github.rxyor.plugin.pom.assistant.action;

import com.github.rxyor.plugin.pom.assistant.common.psi.util.PsiUtil;
import com.github.rxyor.plugin.pom.assistant.ui.maven.SearchDependencyDialog;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 *<p>
 *
 *</p>
 *
 * @author liuyang
 * @date 2020/2/8 周六 14:31:00
 * @since 1.0.0
 */
public class SearchAction extends AbstractPomAction {

    private final static String DIALOG_TITLE = "Search Maven Dependency";

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        final Project project = PsiUtil.getProject(e);
        SearchDependencyDialog dialog = new SearchDependencyDialog(project);
        dialog.popup(DIALOG_TITLE, null, null);
    }
}