package sab2.br.ufpe.cin.core;

import org.apache.maven.plugin.MojoExecutionException;

public interface CmdProvider {
    String runCmdCommand(String command) throws MojoExecutionException;
}