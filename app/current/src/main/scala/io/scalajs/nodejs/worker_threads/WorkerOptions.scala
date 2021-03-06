package io.scalajs.nodejs.worker_threads

import io.scalajs.nodejs.process

import scala.scalajs.js

class WorkerOptions(
    var env: js.UndefOr[process.Environment] = js.undefined,
    var eval: js.UndefOr[Boolean] = js.undefined,
    var execArgv: js.UndefOr[js.Array[String]] = js.undefined,
    var stdin: js.UndefOr[Boolean] = js.undefined,
    var stdout: js.UndefOr[Boolean] = js.undefined,
    var stderr: js.UndefOr[Boolean] = js.undefined,
    var workerData: js.UndefOr[js.Any] = js.undefined
) extends js.Object
