// Module /spa/
// Provides chat slider capability
var spa = (function () {
	
	// Module scope variables
	// Set contants
	var configMaps = {
		extended_height : 434,
		extended_title : 'Click to retract',
		retracted_height : 16,
		retracted_title : 'Click to extend',
		template_html : '<div class="spa-slider"><\/div>'
	};
	// Declare all other module scopre variables
	var $chatSlider, toggleSlider, onClickSlider, initModule;

	// DOM method /toggleslider/	
	// alternates slider height
	toggleSlider = function () {
		var slider_height = $chatSlider.height();
		if ( slider_height === configMaps.retracted_height ) {
			$chatSlider
				.animate({ height : configMaps.extended_height })
				.attr( 'title', configMaps.extended_title );
			return true;
		} else if ( slider_height === configMaps.extended_height ) {
			$chatSlider
				.animate({ height : configMaps.retracted_height })
				.attr( 'title', configMaps.retracted_title );
			return true;
		}
		return false;
	};

	// Event handler /onClickSlider/
	// receices click event and calls toggleSlider
	onClickSlider = function ( event ) {
		toggleSlider();
		return false;
	};

	// Public method /initModule/
	// sets nitial state and provides feature
	// initModule = function ( $container ) {
	// 	// render HTML
	// 	$container.html( configMaps.template_html );

	// 	$chatSlider = $container.find( '.spa-slider' );
	// 	// initialize slider height and title
	// 	// bind the user click event to the event handler
	// 	$chatSlider
	// 		.attr( 'title', configMaps.retracted_title )
	// 		.click( onClickSlider )
	// 	return true;
	// };
	
	initModule = function ( $container ) {
		$container.html(
			'<h1 style="display:inline-block; margin:25px;">'
			+ 'hello world'
			+ '</h1>'
		);
	}

	return { initModule : initModule}
}());