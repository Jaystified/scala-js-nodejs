package io.scalajs.nodejs.tls

import io.scalajs.nodejs.buffer.Buffer

import scala.scalajs.js
import scala.scalajs.js.typedarray.{DataView, TypedArray}
import scala.scalajs.js.|

class ServerOptions(
    var ALPNProtocols: js.UndefOr[
      js.Array[String] | js.Array[TypedArray[_, _]] | js.Array[DataView] | TypedArray[_, _] | DataView
    ] = js.undefined,
    var enableTrace: js.UndefOr[Boolean] = js.undefined,
    var handshakeTimeout: js.UndefOr[Int] = js.undefined,
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    var requestCert: js.UndefOr[Boolean] = js.undefined,
    var sessionTimeout: js.UndefOr[Int] = js.undefined,
    var SNICallback: js.UndefOr[js.Function2[String, js.Function2[io.scalajs.nodejs.Error, SecureContext, Any], Any]],
    var ticketKeys: js.UndefOr[Buffer] = js.undefined,
    // Options for net.createServers
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    var pauseOnConnect: js.UndefOr[Boolean] = js.undefined,
    // Options for tls.createSecureContext
    var ca: js.UndefOr[SecureData] = js.undefined,
    var cert: js.UndefOr[SecureData] = js.undefined,
    var sigalgs: js.UndefOr[String] = js.undefined,
    var ciphers: js.UndefOr[String] = js.undefined,
    var clientCertEngine: js.UndefOr[String] = js.undefined,
    var crl: js.UndefOr[SecureData] = js.undefined,
    var dphram: js.UndefOr[String | Buffer] = js.undefined,
    var ecdhCurve: js.UndefOr[String] = js.undefined,
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    var key: js.UndefOr[SecureData] = js.undefined,
    var maxVersion: js.UndefOr[String] = js.undefined,
    var minVersion: js.UndefOr[String] = js.undefined,
    var passphrase: js.UndefOr[String] = js.undefined,
    var pfx: js.UndefOr[SecureData | js.Array[SecureDataObjectForm]] = js.undefined,
    var secureOptions: js.UndefOr[Int] = js.undefined,
    var secureProtocol: js.UndefOr[String] = js.undefined,
    var sessionIdContext: js.UndefOr[String] = js.undefined
) extends js.Object
