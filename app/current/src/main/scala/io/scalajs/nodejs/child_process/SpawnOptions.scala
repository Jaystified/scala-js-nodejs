package io.scalajs.nodejs.child_process

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * Spawn Options
  *
  * @param cwd      Current working directory of the child process
  * @param env      Environment key-value pairs
  * @param argv0    Explicitly set the value of argv[0] sent to the child process.
  *                 This will be set to command if not specified.
  * @param stdio    Child's stdio configuration. (See options.stdio)
  * @param detached Prepare child to run independently of its parent process.
  *                 Specific behavior depends on the platform, see options.detached)
  * @param uid      Sets the user identity of the process. (See setuid(2).)
  * @param gid      Sets the group identity of the process. (See setgid(2).)
  * @param shell    If true, runs command inside of a shell.
  *                 Uses '/bin/sh' on UNIX, and 'cmd.exe' on Windows. A different shell can be specified as a string.
  *                 The shell should understand the -c switch on UNIX, or /d /s /c on Windows. Defaults to false (no shell).
  */
class SpawnOptions(
    var cwd: js.UndefOr[String] = js.undefined,
    var env: js.Any = js.undefined,
    var argv0: js.UndefOr[String] = js.undefined,
    var stdio: js.UndefOr[StdIo] = js.undefined,
    var detached: js.UndefOr[Boolean] = js.undefined,
    var uid: js.UndefOr[Int] = js.undefined,
    var gid: js.UndefOr[Int] = js.undefined,
    var shell: js.UndefOr[Boolean | String] = js.undefined,
    var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined,
    var windowsHide: js.UndefOr[Boolean] = js.undefined
) extends js.Object
