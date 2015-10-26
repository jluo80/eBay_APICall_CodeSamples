<?php
 
error_reporting(E_ALL);  // Turn on all errors, warnings and notices for easier debugging


$itemID= 221858149377;  //ItemID To USe for getting Recommendations

//Seller Authorization Token
$userAuthToken= 'Authorization:TOKEN AgAAAA**AQAAAA**aAAAAA**VBC4VQ**nY+sHZ2PrBmdj6wVnY+sEZ2PrA2dj6wJnY+oC5iFog6dj6x9nY+seQ**rrwCAA**AAMAAA**PSvMXZHusISrFWnxe0/AmcV3RDtA1uY1yp8eec5MQBNkE98heGCcrF4t3KGKmqSqcUj6PO9HUNX2HyaiJsr2zyY43AG+0VtHWauWaNWBB9YoVitr26LckNmvA+Ufv1VLC1vVbx6929XZx/0xxrvqCe+KT1Mi7FJEeqyalRQf5OMNql52Y9cM/dolMyyRfAOfANHjajkfSrduKjVIFPEQXq4vqvkEI28G20UIpbl//LCGClHnhSKo6tIM8r2sIQPH3gice23aot2q5TR9mQVS2c7Zu+CvK6VZ/mIoUDUyz6QtjuMwyyLdLxH/I+v97gW8wI2MCNpZFBTVhVJwyzRktA4UblajG2y4cUV9IWd1urD9ZhnuY2sI1ikRpqnVEcJXaKcEk54rLYPoDtFjLlWGCuOVfrTRgT+XqerU+hjeoXRKtZDrMLJ9mV6T2od2WCBStei0K0gZ39UHJCC1SACNeS2PBn+mq7bOMaz/ECp/1gJN3YE8IltL0JBTeGaYw9tYGjTziXDVUb5YARLWqCJpTveeiJdMrUbXCOCbve5bPrd4u9wFDZdX7kX9GfId39ng9Te7n9r3c3oxTk/WCqFW4J/Tt5rJN0rstLuHAVEioxMREbitx/n4QmiNNR9t1ghWyRyr6rLuqwE3FeKlVYjm/7g+YRZymrAxUtc2NKA0blWDDdmDEFqHw8AFoHaFOYCiqDRBhEFcsLW2Gv0nGu+b6JM41plIAWVxwZ9rlDkJjwpeWtBVdHmeNAjpAYZ82FOk';

//Endpoint URL to Use
$url = "https://svcs.ebay.com/services/selling/listingrecommendation/v1/item/$itemID/itemRecommendations";

//initialise a CURL session
$connection = curl_init();

//Set Endpoint URL 
curl_setopt($connection,CURLOPT_URL,$url);

//Set Method as GET; Bydefault it is Get, So it is OK if you do not set it if the call is Get call
curl_setopt($connection, CURLOPT_HTTPGET, true);

//Create Array of Headers
$headers = array();
$headers[] = $userAuthToken;
$headers[] = 'X-EBAY-GLOBAL-ID:EBAY-US';

//set the headers using the array of headers
curl_setopt($connection,CURLOPT_HTTPHEADER,$headers);

//set it to return the transfer as a string from curl_exec
curl_setopt($connection,CURLOPT_RETURNTRANSFER,1);

//stop CURL from verifying the peer's certificate
curl_setopt($connection, CURLOPT_SSL_VERIFYPEER, 0);
curl_setopt($connection, CURLOPT_SSL_VERIFYHOST, 0);

//Send the Request
$response = curl_exec($connection);

//get information about the cURL request
// $info = curl_getinfo($connection);
//echo 'Took ' . $info['total_time'] . ' seconds for url ' . $info['url']."<br />";

//close the connection
curl_close($connection);

//Check If Response is OK
if (stristr($response, 'HTTP 404') || $response == '')
    die('<P>Error sending request, Please check the Request');


$data=json_decode($response,true);
if ($data === NULL) die('Error parsing json');


?>

<!-- Print the Required Fileds in table format -->
<table border='1px'>
<?php
foreach ($data["Recommendation"] as $arrayRow){
	echo '<tr><th style="background-color:#E6E6FA; border-radius:20px">Recommendation</th></tr>';
	
	$ignoreArray = array(
			"recommendationData","value"
	);
	
	foreach($arrayRow as $arrayColKey => $arrayColValue){
		if(!in_array($arrayColKey,$ignoreArray)){
			echo '<tr><td> <b>'.$arrayColKey.'</b>     =>    '. $arrayColValue . '</td></tr>';
		}
		
	}
	
	echo '</tr>';
}
echo '</table>';
?>



